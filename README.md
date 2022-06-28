# Extension functions for BigInteger and BigDecimal
Various Kotlin extensions for [java.math.BigInteger](https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html) and [java.math.BigDecimal](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html)

Adds convenient way to convert things into BigInteger and BigDecimal, this includes extension properties for Int, Long and Double. It also allows standard arithmatic between "_BigNumber_" and Int, Long and Double.
```kotlin
val bigIntArith = ((10.bi + 12) * 2 / 10) - 1 // = 3 (BigInteger)
val bigDecArith = ((10.bd + 12) * 2 / 10) - 1 // = 3.4 (BigDecimal)
```
**Important:** Note that `RoundingMode.FLOOR` is used when doing division with BigInteger, which replicates how Kotlin handles standard integer division. It is also important to note, that BigDecimal division uses a precision of 20 by default and uses `RoundingMode.HALF_UP`.

## More Examples
```kotlin
var crazy = ((10L.bi + 12) * 2.0 / "10".bi) - 1 // = 3.4 (BigDecimal)
crazy += 2 // = 5.4 (BigDecimal)
floor(crazy) // = 5 (BigInteger)
ceil(crazy) // = 6 (BigInteger)
```
**Important:** Note that any arithmatic involving a Double will return a BigDecimal.
