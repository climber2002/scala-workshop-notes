## scala and sbt console

Scala commandline shell

sbt console

## val vs var

You can't change a val

```
val a = 1
```

## String

### Interpolation

val x = 3

s"The number is $x"

## Functions

```
def add(a: Int, b: Int): Int = a + b 

def add(a: Int, b: Int): Int = { a + b } 

val add2 = (a: Int, b: Int): Int => a + b
```

- if the implementation is only one expression, () could be omitted
- the last expression is the return value of the function, same as Ruby

### Invocation

add(b = 3, a = 2)

### function call OPERATORS ARE METHODS

3 + 2 == 3.+(2)

### functions without brackets

def one: Int = 1

def two(): Int = 2

### Curried

def addCurried(a: Int)(b: Int): Int = a + b

### Functions with Type parameters

def lengthOfList[A](list: List[A]): Int = list.length

## If else
```
def dontDoThis(x: Int): String = 
  if (x > 0) "positive"
```


Exercise:

- Create a function `abs(x: Double): Double` which returns the absolute value
- Create a function `foobar(i: Int): String` if i is a multiple of 5 then return "foo", else return "bar"
- Create a function `compare(a: Int, b: Int): Int` which
  - if a == b return 0
  - if a > b return 1
  - if a < b return -1

```
def compare(a: Int, b: Int): Int = {
  if (a == b)
    0
  else if (a > b)
    1
  else
    -1
 }
```


## Tuple

(1, "two")

## Unit

Unit

## Show how to run test in Intellij

## Exercise level01





