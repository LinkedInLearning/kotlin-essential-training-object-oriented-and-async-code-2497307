import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

private suspend fun loadItemsFromDB(): List<String> {
    delay(5000)
    return listOf("Kotlin", "Java", "C#")
}

private suspend fun loadItemsFromNetwork(): List<String> {
    delay(5000)
    return listOf("Rust", "Python", "C")
}

// Use async() to parallelize the execution of the two provided suspend functions
// Use await() to get results of both async() calls
// Convert the results into a unified list and print out to the console
fun main(): Unit = runBlocking {
    val db = async { loadItemsFromDB() }
    val network = async { loadItemsFromNetwork() }

    val results = db.await() + network.await()

    results.forEach { language -> println(language) }
}
