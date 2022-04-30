
open class Person(
    age: Int,
    protected val firstName: String,
    protected val lastName: String
) {

    init {
        check(age >= 0) {
            "A person's age cannot be negative"
        }
    }

    val age: Int = age

    open fun printName() = println("$firstName $lastName")
}
