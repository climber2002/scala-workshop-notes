# List definition

```
sealed trait List[+A]
case class ::[A](head: A, tail: List[A]) extends List[A]
case object Nil extends List[Nothing]
```

```
List(1, 2, 3, 4)
```
## List concat

```
Nil.::(2)

`::`(2, List(3, 4))
```

```
1 :: List(2, 3)
List(2, 3) :+ 4
```

## Pattern match

```
def elements(l: List[Int]): String = l match {
  case i1 :: i2 :: _ => s"Contains at least two elements, first is $i1 and second is $i2" 
  case i :: _ => s"Contains at least one element, and first is $i"
  case _ => s"Contains no element"
}
```

### Quiz
```
val e = List(1, 2, 3) match {
  case x :: xs => xs.head
  case _ => 0
}

// What's the value of e
```


```
val r = List(1, 2, 3) match {
  case x :: y :: Nil => y
  case _ => 0
}

what's value r?
```

## map

```
def double(l: List[Int]): List[Int] = l.map(i => i * 2)
```

```
def flatten(l: List[List[Int]]): List[Int] = l.flatten
```

## foldLeft

```
(1 to 10).toList.foldLeft(0)((sum, i) => sum + i)

(1 to 10).toList.foldRight(0)((i, sum) => sum + i)
```

## Other functions

- filter
- zipWithIndex
- takeWhile
