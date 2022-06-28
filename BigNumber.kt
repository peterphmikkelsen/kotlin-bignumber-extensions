import java.math.BigInteger
import java.math.BigDecimal
import java.math.RoundingMode

// ================= BigInteger =================

val Int.bi: BigInteger
    get() = BigInteger("$this")

val String.bi: BigInteger
    get() = BigInteger(this)

val Long.bi: BigInteger
    get() = BigInteger("$this")

val BigInteger.TWO: BigInteger
    get() = BigInteger("2")

val BigInteger.THREE: BigInteger
    get() = BigInteger("3")

val BigInteger.FOUR: BigInteger
    get() = BigInteger("4")

val BigInteger.FIVE: BigInteger
    get() = BigInteger("5")

operator fun BigInteger.plus(x: Int) = this + x.bi
operator fun Int.plus(x: BigInteger) = this.bi + x
operator fun BigInteger.plus(x: Long) = this + x.bi
operator fun Long.plus(x: BigInteger) = this.bi + x

operator fun BigInteger.minus(x: Int) = this - x.bi
operator fun Int.minus(x: BigInteger) = this.bi - x
operator fun BigInteger.minus(x: Long) = this - x.bi
operator fun Long.minus(x: BigInteger) = this.bi - x

operator fun BigInteger.times(x: Int) = this * x.bi
operator fun Int.times(x: BigInteger) = this.bi * x
operator fun BigInteger.times(x: Long) = this * x.bi
operator fun Long.times(x: BigInteger) = this.bi * x

operator fun BigInteger.div(x: Int) = this / x.bi
operator fun Int.div(x: BigInteger) = this.bi / x
operator fun BigInteger.div(x: Long) = this / x.bi
operator fun Long.div(x: BigInteger) = this.bi / x

operator fun BigInteger.rem(x: Int) = this.remainder(x.bi)
operator fun BigInteger.rem(x: Long) = this.remainder(x.bi)

operator fun BigInteger.unaryMinus() = this.negate()

// ================= BigDecimal =================

val Int.bd: BigDecimal
    get() = BigDecimal(this)

val Double.bd: BigDecimal
    get() = BigDecimal(this)

val Long.bd: BigDecimal
    get() = BigDecimal(this)

val String.bd: BigDecimal
    get() = BigDecimal(this)

val BigDecimal.TWO: BigDecimal
    get() = BigDecimal(2)

val BigDecimal.THREE: BigDecimal
    get() = BigDecimal(3)

val BigDecimal.FOUR: BigDecimal
    get() = BigDecimal(4)

val BigDecimal.FIVE: BigDecimal
    get() = BigDecimal(5)

operator fun BigDecimal.plus(x: Int) = this + x.bd
operator fun Int.plus(x: BigDecimal) = this.bd + x
operator fun BigDecimal.plus(x: Double) = this + x.bd
operator fun Double.plus(x: BigDecimal) = this.bd + x
operator fun BigDecimal.plus(x: Long) = this + x.bd
operator fun Long.plus(x: BigDecimal) = this.bd + x
operator fun BigDecimal.plus(x: BigInteger) = this + BigDecimal(x)
operator fun BigInteger.plus(x: BigDecimal) = BigDecimal(this) + x

operator fun BigDecimal.minus(x: Int) = this - x.bd
operator fun Int.minus(x: BigDecimal) = this.bd - x
operator fun BigDecimal.minus(x: Double) = this - x.bd
operator fun Double.minus(x: BigDecimal) = this.bd - x
operator fun BigDecimal.minus(x: Long) = this - x.bd
operator fun Long.minus(x: BigDecimal) = this.bd - x
operator fun BigDecimal.minus(x: BigInteger) = this - BigDecimal(x)
operator fun BigInteger.minus(x: BigDecimal) = BigDecimal(this) - x

operator fun BigDecimal.times(x: Int) = this * x.bd
operator fun Int.times(x: BigDecimal) = this.bd * x
operator fun BigDecimal.times(x: Double) = this * x.bd
operator fun Double.times(x: BigDecimal) = this.bd * x
operator fun BigDecimal.times(x: Long) = this * x.bd
operator fun Long.times(x: BigDecimal) = this.bd * x
operator fun BigDecimal.times(x: BigInteger) = this * BigDecimal(x)
operator fun BigInteger.times(x: BigDecimal) = BigDecimal(this) * x

operator fun BigDecimal.div(x: Int) = this / x.bd
operator fun Int.div(x: BigDecimal) = this.bd / x
operator fun BigDecimal.div(x: Double) = this / x.bd
operator fun Double.div(x: BigDecimal) = this.bd / x
operator fun BigDecimal.div(x: Long) = this / x.bd
operator fun Long.div(x: BigDecimal) = this.bd / x
operator fun BigDecimal.div(x: BigInteger) = this / BigDecimal(x)
operator fun BigInteger.div(x: BigDecimal) = BigDecimal(this) / x

operator fun BigDecimal.rem(x: Int) = this.remainder(x.bd)
operator fun BigDecimal.rem(x: Double) = this.remainder(x.bd)
operator fun BigDecimal.rem(x: Long) = this.remainder(x.bd)

operator fun BigDecimal.unaryMinus() = this.negate()

fun ceil(x: BigDecimal) = x.setScale(0, RoundingMode.CEILING).unscaledValue()
fun floor(x: BigDecimal) = x.setScale(0, RoundingMode.FLOOR).unscaledValue()
fun round(x: BigDecimal) = x.setScale(0, RoundingMode.HALF_UP).unscaledValue()