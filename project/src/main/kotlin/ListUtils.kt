
fun <T> Array<T>.nonEmptyList(): List<T> {
    check(isNotEmpty()) {
        "NonEmptyList must have at least one item"
    }
    return toList()
}

fun <T> Set<T>.toNonEmptyList(): List<T> {
    check(isNotEmpty()) {
        "NonEmptyList must have at least one item"
    }
    return toList()
}