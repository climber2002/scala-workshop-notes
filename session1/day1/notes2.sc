// Define a class
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

// Trait
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

