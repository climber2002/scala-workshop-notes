
```
"2".toInt
"a".toInt
```

```
class NegativeNumberException extends RuntimeException

def sumOfPositiveNums(a: Int, b: Int): Int = {
  if (a < 0 || b < 0) throw new NegativeNumberException
  a + b
}
```