import java.util.concurrent.Executor
import java.util.concurrent.Executors

class CustomThread : Thread("CustomThread") {
    override fun run() {
        super.run()
        println(Thread.currentThread().name)
        println("CustomThread.run()")
    }
}

class CustomRunnable : Runnable {
    override fun run() {
        println(Thread.currentThread().name)
        println("CustomRunnable.run()")
    }
}

val executor = Executors.newSingleThreadExecutor()
val multiThreadExecutor = Executors.newFixedThreadPool(3)

fun main() {
    println(Thread.currentThread().name)
    //CustomThread().start()

//    Thread(CustomRunnable()).start()

//    executor.submit(CustomRunnable())

    for (i in 0..10) {
        multiThreadExecutor.submit(CustomRunnable())
    }
}
