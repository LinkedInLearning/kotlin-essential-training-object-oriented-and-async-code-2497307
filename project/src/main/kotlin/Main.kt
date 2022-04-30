import kotlin.random.Random

// Use getRandomString() to write a function named getString()
// getString() should call getRandomString() and return StringResult
// calling getString() should never crash
// errors should be wrapped with StringResult.Failure
fun main() {
    when (val result = getString()) {
        is StringResult.Error -> println("There was an error")
        is StringResult.Success -> println(result.value)
    }
}

fun getString(): StringResult {
    return try {
        StringResult.Success(getRandomString())
    } catch (error: java.lang.IllegalStateException) {
        StringResult.Error(error)
    }
}

fun getRandomString(): String {
    val rand = Random.nextInt(10)
    return if (rand > 5) {
        throw IllegalStateException()
    } else {
        rand.toString()
    }
}