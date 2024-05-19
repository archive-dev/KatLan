# Syntax

## Class Definitions

1. Classes can be defined as unnamed. In that case class with FileName and public access will be created.
   If you need your class to be implementation of other, then you add ```extends InterfaceName```.
   <br/> To implement multiple classes you just add them separated by commas.
   With new syntax (since 05.19.2024 commit) all class methods and fields must be defined inside curly braces, otherwise
   they will be [package methods and fields](#package-methods-and-fields) (you can define them before and after braces).
   <br/>
   Then you can define fields and/or methods:

   ```
   // file name is example.kat
   { ... }
     
   ```

2. Named classes are defined as usual, with `class` keyword. Class can be abstract and implement other classes:

    ```
   pub class Example : Example1, Example2 {
        // some code...
   }
   ```

   Then you work with the classes as usual.

## Variable definitions

Variable can be declared with `var` or `const` keyword. In addition, it can have access modifiers like `public` (or `pub`), `private` (or `priv`), `protected` (or `prot`), `static` and `final`, from which latter two are not applicable to `const`.
Only `var`s can be declared inside a method's body.
```
pub class Example {
    pub static final var name: str
    
    const PI: double = 3.14d // to be implemented
    
    pub static def main(args: str[]) {
        var a: int = 5 
        var b: int = 10
        
        if (a > b) print(a + ' is bigger than ' + b);
        else if (a < b) print(b + ' is bigger than ' + a);
        else print(a + ' is equal to ' + b);
    }
}
```

## Method definitions

Any method can be defined with `def` keyword with access modifiers (as given in [Variable definitions](#variable-definitions)) going before it.
Method's parameters are declared as `name : type`.
```
pub class Example {
    pub static def main(args: str[]) {
        var a: int = 5 
        var b: int = 10
        
        if (a > b) print(a + ' is bigger than ' + b);
        else if (a < b) print(b + ' is bigger than ' + a);
        else print(a + ' is equal to ' + b);
    }
}
```

## Constructor definitions

To define a constructor in a class, you can use the `new` keyword, just like you would define a method. Unlike methods, constructors do not have a return type.

```
pub class Example {
    priv var name: str
    
    pub new AnyNameBTW(name: str) {
        this.name = name
    }
}
```

## Other

### If's

Ifs are looking similar to java's. Nothing new here.

```
if (a == b) print('a is equal to b');
else if (!nothingNew) { 
   print('there is something new')
} else print('nothing new and a is not b');
```

### Switch statements

Switches in java can use only primitive types. KatLan fixes it and allows you to use any type in switches.
Also switches in java require you to write `break` at the end of case block. This is also fixed:
```
switch (string) {
   'no' -> print('why')
   'yes' -> print('cool')
   default -> {
      print('what?')
   }
}
```

### Loops

#### While loop

While loops are easy in almost every language, so are the in KatLan.
```
while (cond) {
   doCode()   
}
```

#### For loops

There are 2 types of for loops in KatLan.
###### TODO: add foreach loops

1. "Kotlin-like". This type of loops looks like this:
   ```
   for (i: int, 0..10) {
      code()
   }
   ```
   Where `i: int` is needed to set counter name and type and `0..10` is range of loop (from `0` to `10`).

2. Regular for loops. Nothing crazy or too hard, regular for loops, that look like this:
   ```
   for (var i: int = 0; i < 10; i++) {
      code()
   }   
   ```
   While KatLan does not have foreach loops (for now) you can use for-i loops instead:
   ```
   var someList: List = new ArrayList();
   
   // solution with `iterators`
   for (var it: Iterator = someList.iterator(); iterator.hasNext(); ;) {
      var o: obj = it.next()
      // some code with list objects...   
   }
   
   // simple solution with list.get()
   for (var i: int = 0; i < list.size(); i++) {
      var o: obj = list.get(i)
      // some code with list objects...
   }
   ```

### Annotations

Annotations can be used when defining a method, field or class, and when calling a method. <br/>
To use an annotation write ```$Annotation``` and add ```(parameters)``` if any

```
$Serialize
pub class Example {
   $Serialize
   pub var name: str
   
   $LogTime
   pub static def main(args: str[]) {
      $Repeat(5)
      print('hello')
   }  
}
```

To create one you need to create a new `annotation` class:

```
// this annotation is not java's one so
// don't mess them up
$Target(KLTarget.METHOD_CALL) 
pub annotation ExampleAnnotation {
   
}
```

Because in KatLan annotations are not super special class types you can extend and implement other classes within
your annotations:
```
$Target(KLTarget.METHOD_CALL)
pub annotation ExampleAnnotation : ExampleInterface {
   
}
```

Annotation values are just fields, so you can use any type you want:

```
import java.net.URL

$Target(KLTarget.METHOD_CALL)
pub annotation ExampleAnnotation : ExampleInterface {
   pub var url: URL
}
```

To add `pre-action` and/or `post-action` handler you need to create a method with `pre` or `post` modifier:

```
import java.net.URL

$Target(KLTarget.METHOD_CALL)
pub annotation ExampleAnnotation : ExampleInterface {
   pub var url: URL
   
   pub pre def handleCall(annotated: KLAnnotatedElement): void {
      print(annotated.getThisTargetType())
   }
}
```

Or you can still create them in Java:

```Java
@Target({KLTarget.METHOD_CALL})
public class ExampleAnnotation extends KLAnnotation {
   public ExampleAnnotation(KLAnnotatedElement annotated) {
      super(annotated);
   }
   
   // name of method might be anything else as long it has an annotation 
   @BeforeMethodCall
   public void handle() {
      System.out.println(annotatedObject);   
   }
}
```

### Package methods and fields

C# has `namespace`s and KatLan has `package`s. Package can have fields, methods and classes (almost like java).
<br/> To define one create KatLan file and (optionally) add `package` keyword to it:

```
package org.example // this is optional


```

Then you start adding fields, methods and classes. Adding static modifiers to them is not necessary as compiler does it for you:

```
package org.example // this is optional

pub var PI: float = 3.14f;

pub def foo(): void {
   print(bar)
}

pub class ExampleC {
   pub fin var name: str
}

```