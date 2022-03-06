## classes

```
class User

val user1 = new User
```

```scala
class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}

val point1 = new Point(2, 3)
println(point1.x)  // 2
println(point1)  // prints (2, 3)
```

```scala
class Name(val firstName: String, val lastName: String)
```

## Traits

```scala
import scala.collection.mutable.ArrayBuffer

trait Pet {
  def name: String // getter
  
  def speak: String = "Yo"
}

class Cat(val name: String) extends Pet {
  override def speak: String = "meow" // Must use override
}

class Dog(val name: String) extends Pet {
  override def speak: String = "woof"
}

val dog = new Dog("Harry")
val cat = new Cat("Sally")

val animals = ArrayBuffer.empty[Pet]
animals.append(dog)
animals.append(cat)
animals.foreach(pet => println(pet.name))
```

## Singleton objects

```scala
object aaa extends Name("aaa", "bbb")
```

## case classes

```
case class Person(name: String, age: Int)

val john = Person("John", 25)
```

Instances of case classes are immutable

### equals

```
val john2 = Person("John", 25)

john == john2
```

### copy

```
val john2 = john.copy(age = 26)
```


## Pattern matching

```
import scala.util.Random

val x: Int = Random.nextInt(10)

x match {
  case 0 => "zero"
  case 1 => "one"
  case 2 => "two"
  case _ => "other"
}
```

```
def matchTest(x: Int): String = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "other"
}
matchTest(3)  // returns other
matchTest(1)  // returns one
```

### Matching on case classes and objects

```
trait Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case object SpecialNotification extends Notification

def showNotification(notification: Notification): String = {
  notification match {
    case Email(sender, title, _) =>
      s"You got an email from $sender with title: $title"
    case SMS(number, message) =>
      s"You got an SMS from $number! Message: $message"
    case SpecialNotification =>
      s"Oh, it's THE special notification"
  }
}
val someSms = SMS("12345", "Are you there?")
val email = Email("aaa@example.com", "Hello", "Are you there?")

println(showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?

```

### Pattern guards

def numToStr(num: Int): String = num match {
  case x if x == 1 => "one, a lonely number"
  case x if (x == 2 || x == 3) => x.toString
  case x => s"some other value: ${x}"
}

### Sealed classes

sealed trait Furniture
case class Couch() extends Furniture
case class Chair() extends Furniture

def findPlaceToSit(piece: Furniture): String = piece match {
  case a: Couch => "Lie on the couch"
  case b: Chair => "Sit on the chair"
}

## Exercise level2


