# Definition

```
/**
  * Option data type
  *
  * sealed trait Option[+A]
  * case class Some[A](a: A) extends Option[A]
  * case object None extends Option[Nothing]
  */
```

```
val states = Map("VIC" -> "Victoia", 
                 "NSW" -> "New South Wales",
                 "TAS" -> "Tasmania",
                 "SA"  -> "South Australia",
                 "NT"  -> "North Territory",
                 "QLD" -> "Queensland",
                 "WA"  -> "West Australia",
                 )
```

### Create 

```
Some(3)
Option(3)
Option(null)
```

### Quiz

```
/** if flag is true return Some("Found value"), otherwise return None
*/
def maybeItWillReturnSomething(flag: Boolean): Option[String] = ???
```

### pattern match

```
def times2(option: Option[Int]): Option[Int] = option match {
  case Some(i) => Some(i * 2)
  case None => None
}
```

### OptionExercise1

### map

Option(1).map(i => i * 2)

* See similarity with List.map?
* You have found Functor  https://en.wikipedia.org/wiki/Functor_(functional_programming)



### Option Exercise2 (part 1)


### orElse and getOrElse

```
maybeItWillReturnSomething(false).getOrElse("Empty value")
```
