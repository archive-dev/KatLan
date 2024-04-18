# Syntax

## Class Definitions

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

To define a constructor you use the `new` keyword as if you were defining a method. When declaring a constructor no return type needed.

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