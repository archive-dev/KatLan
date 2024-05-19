package org.katarine.katlan.lib;

import org.katarine.katlan.lib.annotations.KLAnnotatedElement;
import org.katarine.katlan.lib.annotations.KLAnnotation;
import org.katarine.katlan.lib.annotations.Target;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldLink extends FieldHandleable implements Serializable, Accessible, KLAnnotatedElement { // @fieldName
    private final String fieldName;
    private final Class<?> type;
    private final ClassLink classLinkType;
    private final Access access;
    private final Ownership ownership;
    private final org.katarine.katlan.lib.Modifier modifier;
    private final Annotation[] annotations;
    private KLAnnotation[] klAnnotations;
    private final ClassLink declaringClassLink;
    private final Class<?> declaringClass;
    private final KLPackage pkg;

    private final Field field;

    /**
     * Base constructor for creating a FieldLink. May be used in any case, but recommended to use in KatLan context.
     * @param declaringClass Class which declares this field.
     * @param fieldName Name of field to be referenced.
     * @param klAnnotations KatLan annotations of this field. They are automatically set by compiler.
     */
    public FieldLink(Class<?> declaringClass, String fieldName, KLAnnotation... klAnnotations) {
        this.fieldName = fieldName;
        this.declaringClass = declaringClass;
        try {
            this.field = declaringClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        this.type = field.getType();

        this.declaringClassLink = ClassLink.of(this.declaringClass);
        this.classLinkType = ClassLink.of(this.type);
        this.pkg = KLPackage.of(this.declaringClass.getPackage());
        this.annotations = field.getAnnotations();

        try {
            if (Modifier.isStatic(this.field.getModifiers())) {
                this.ownership = Ownership.STATIC;
            } else {
                this.ownership = Ownership.INSTANCE;
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }

        if (Modifier.isAbstract(this.field.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.ABSTRACT;
        else if (Modifier.isFinal(this.field.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.FINAL;
        else this.modifier = org.katarine.katlan.lib.Modifier.NONE;

        if (Modifier.isPublic(this.field.getModifiers())) this.access = Access.PUBLIC;
        else if (Modifier.isPrivate(this.field.getModifiers())) this.access = Access.PRIVATE;
        else if (Modifier.isProtected(this.field.getModifiers())) this.access = Access.PROTECTED;
        else this.access = Access.PACKAGE_PRIVATE;

        this.klAnnotations = klAnnotations;
    }

    public FieldLink(Field field) {
        this(field.getDeclaringClass(), field.getName());
    }

    public void set(Object instance, Object value) {
        try {
            checkAccess(instance);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        boolean accessible = field.canAccess(instance);
        field.setAccessible(true);
        try {
            field.set(instance, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            field.setAccessible(accessible);
        }
    }

    public Object get(Object instance) {
        try {
            checkAccess(instance);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        boolean accessible = field.canAccess(instance);
        field.setAccessible(true);
        try {
            return field.get(instance);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            field.setAccessible(accessible);
        }
    }

    /**
     * This method does: <br>
     * <table>
     *     <table>
     *          1. manipulations with owner of this field (calls other methods, forbids access or changes field value), <br>
     *     </table>
     *     <table>
     *          2. returns value of this field and then <br>
     *     </table>
     *     <table>
     *          3. does manipulations with field value and instance (for example increments value of field).
     *     </table
     * </table>
     * <br>
     * Why would you use this method?
     * <table>
     *     For example, in C# you can create custom getters and setters, however this feature is not supported in java.
     *     To achieve that you can use {@code ...WithHandlers} versions of {@link FieldLink#get(Object)} and {@link FieldLink#set(Object, Object)} methods.
     * </table>
     * @param instance Object that owns this field or null if field is static.
     * @return Field value before postHandlers process it.
     */
    public Object getWithHandlers(Object instance) {
        preHandlers.forEach(h -> h.handle(instance));
        preGetHandlers.forEach(h -> h.handle(instance));
        Object rValue = get(instance);
        try {
            return rValue;
        } finally {
            postHandlers.forEach(h -> h.handle(instance, rValue));
            postGetHandlers.forEach(h -> h.handle(instance, rValue));
        }
    }

    /**
     * This method does: <br>
     * <table>
     *     <table>
     *          1. manipulations with owner of this field and given value (calls other methods, forbids access or changes field value), <br>
     *     </table>
     *     <table>
     *          2. sets value of this field to {@code value} and then <br>
     *     </table>
     *     <table>
     *          3. does manipulations with field value and field owner (for example increments value of field).
     *     </table
     * </table>
     * <br>
     * Why would you use this method?
     * <table>
     *     For example, in C# you can create custom getters and setters, however this feature is not supported in java.
     *     To achieve that you can use {@code ...WithHandlers} versions of {@link FieldLink#get(Object)} and {@link FieldLink#set(Object, Object)} methods.
     * </table>
     * @param instance Object that owns this field or null if field is static.
     * @param value Value to set.
     */
    public void setWithHandlers(Object instance, Object value) {
        preHandlers.forEach(h -> h.handle(instance));
        preSetHandlers.forEach(h -> h.handle(instance));
        set(instance, value);
        postHandlers.forEach(h -> h.handle(instance, value));
        postSetHandlers.forEach(h -> h.handle(instance, value));
    }

    @Override
    public Access access() {
        return this.access;
    }

    @Override
    public void checkAccess(Object caller) throws IllegalAccessException {
        if (this.access != Access.PUBLIC && caller.getClass().equals(this.declaringClass)) throw new IllegalAccessException("Instance can't access field " + this.fieldName);
        if (this.ownership != Ownership.STATIC && caller == null) throw new IllegalAccessException("Instance is null on non-static field " + this.fieldName);

        if (!this.field.canAccess(caller)) throw new IllegalAccessException("Instance can't access field " + this.fieldName);
    }

    @Override
    public Target.KLTarget getThisTargetType() {
        return Target.KLTarget.FIELD;
    }

    @Override
    public KLAnnotation[] getKlAnnotations() {
        return new KLAnnotation[0];
    }
}
