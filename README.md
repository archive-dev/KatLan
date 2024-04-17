# KatLan
KatLan ([Katarine](https://github.com/whoisamyy/katarine) Language) is a JVM-compatible language that tries to make Java syntax less boilerplate.

## Syntax

### Class Definitions

1. Classes can be defined as unnamed. In that case class with FileName and public access will be created. If you need your class to be implemetation of other, then you write ```extends InterfaceName```.
<br> To implement multiple classes you just add them separated by commas.
Then you can define fields and/or methods:
    ```
        // file name is example.kat

        extends Example1, Example2
        
        pub var name: str
        
        pub def getName(): str {
            return name;    
        }
    ```

    After all methods and field defined you can add code, that will automatically added to `main()` method:

    ```
        // file name is example.kat

        extends Example1, Example2
        
        pub var name: str
        
        pub def getName(): str {
            return name;    
        }

        print(new Example().getName()) // null
    ```
    That's it with unnamed classes.

1. Named classes are defined as usual, with `class` keyword. Class can be abstract and implement other classes:

    ```
   pub class Example : Example1, Example2 {
        // some code...
   }
   ```

   Then you work with the classes as usual.

### Variable definitions

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

### Method definitions

Any method can be defined with `def` keyword with access modifiers (as given in [Variable definitions](#variable-definitions)) going before it.

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


# Building and Compiling

## Building

To build the compiler you need to have: 
1. Java 21 (recommended, didn't test on previous versions)
2. Gradle compatible with your java version (for java 21 the version is 8.6)

Command to build is: `gradlew compiler:build`

## Compiling code

To compile your KatLan code you need to run in your console:
   `java -jar <compiler-jar-name> filename.kat`

Output will be in the same folder as your jar and will have .class (JVM bytecode) extension.

# Other info

If you need to contact me:
https://discord.com/invite/SHcn3bcmCR
https://discord.gg/3SAkb5C44u
or just dm me in discord: whoisamyy#0

Feel free to send PR's and creating issues on github.