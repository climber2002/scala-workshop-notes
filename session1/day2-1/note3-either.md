# Either

Option can only represents a value exists or not, but some times we want to know if an error exists or not

Either is just like Option
Right is just like Some, success case
Left is just like None, except you can include content with it to describe the problem, error case

```
def divideXByY(x: Int, y: Int): Either[String, Int] = {
  if (y == 0) Left("Dude, can't divide by 0")
  else Right(x / y)
}

println(divideXByY(1, 0))
println(divideXByY(1, 1))
divideXByY(1, 0) match {
  case Left(s) => println("Answer: " + s)
  case Right(i) => println("Answer: " + i)
}
```



