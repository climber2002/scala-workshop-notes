val e = List(1, 2, 3) match {
  case x :: xs => xs.head
  case _ => 0
}

// What's the value of e?


val r = List(1, 2, 3) match {
  case x :: y :: Nil => y
  case _ => 0
}

// what's value r?