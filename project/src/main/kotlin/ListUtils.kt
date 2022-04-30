// Refactor the methods to top-level extension functions
// Once the functions are converted, the ListUtils class shouldn't be needed
class ListUtils {
    companion object {
        fun <T> nonEmptyList(vararg items: T): List<T> {
            check(items.isNotEmpty()) {
                "NonEmptyList must have at least one item"
            }
            return items.toList()
        }

        fun <T> setToNonEmptyList(set: Set<T>): List<T> {
            check(set.isNotEmpty()) {
                "NonEmptyList must have at least one item"
            }
            return set.toList()
        }
    }
}