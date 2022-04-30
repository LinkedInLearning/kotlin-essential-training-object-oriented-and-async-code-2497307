
val Int.isEven: Boolean
    get() = this.mod(2) == 0

fun main() {
//    millisForHours(4)
//    millisForHours(10)

    4.millisForHours()
    10.millisForHours()

    "[abc]+".toRegex()

//    println(8.isEven)
//    println(7.isEven)

    5.log()
    "sample string".log()
    listOf(1, 2, 3).log()
}