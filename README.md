# scala-practice

# sum
```
scala> import practice.sum
import practice.sum

scala> sum(List(1,3,2))
res1: Int = 6
```

# max
```
scala> import practice.max
import practice.max

scala> max(List(1,3,2))
res1: Int = 3
```

# pascal
```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```
```
scala> import practice.pascal
import practice.pascal

scala> pascal(2,3)
res1: Int = 3

scala> pascal(2,4)
res1: Int = 6
```

# balance
Ok
```
"(+ (* 1 2 3) 2 2)"
"this is a (  )."
```
Bad
```
"(+ (* 1 2 3 2 2)"
"this is a )  (."
```

# countChange
4, (1,2) -> 1+1+1+1, 1+1+2, 2+2

7, (1,2,5) -> 1+1+1+1+1+1+1, 1+1+1+1+1+2, 1+1+1+2+2, 1+2+2+2, 1+1+5, 2+5
