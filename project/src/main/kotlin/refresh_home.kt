import kotlinx.coroutines.*

private fun refreshTasks() {
    println("Refreshing tasks on ${Thread.currentThread().name}")
}
private fun refreshReservations() {
    println("Refreshing reservations on ${Thread.currentThread().name}")
}
private fun refreshUser() {
    println("Refreshing user on ${Thread.currentThread().name}")
}
private fun updateUI() {
    println("Updating UI on ${Thread.currentThread().name}")
}

private fun cancelEverything(vararg jobs: Job) {
    jobs.forEach { it.cancel() }
}

fun main(): Unit = runBlocking {
    refreshTasks()
    refreshReservations()
    refreshUser()
}