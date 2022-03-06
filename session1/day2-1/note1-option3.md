# Option

## flatMap

```
def add(a: Option[Int], b: Option[Int]): Option[Int] = (a, b) match {
  case (Some(ai), Some(bi)) => Some(ai + bi)
  case _ => None
}

/**
Wrong version
*/
def add2(a: Option[Int], b: Option[Int]): Option[Int] = 
  a.map(ai => b.map(bi => ai + bi))

def add2(a: Option[Int], b: Option[Int]): Option[Int] = 
  a.flatMap(ai => b.map(bi => ai + bi))

def add3(a: Option[Int], b: Option[Int]): Option[Int] =
  for {
    ai <- a
    bi <- b
  } yield ai + bi
```

Scala will convert for comprehension to flatMap or map

Quiz: what's following value 

```scala
val i2 = for {
  i <- Option(3)
} yield i * 2
```


```scala
case class Person(name: String, age: Int)

val result1: Option[Person] = 
  for {
    name <- Some("Bob")
    age  <- Some(20)
  } yield Person(name, age)

println(result1)

val result2: Option[Person] = 
  for {
    name <- Some("Bob")
    age  <- None
  } yield Person(name, age)

println(result2)
```

## for comprehension
For Comprehension is a powerful technique for working with values in "containers", e.g. `Option`, `Either`, `Try`, `List`, etc.