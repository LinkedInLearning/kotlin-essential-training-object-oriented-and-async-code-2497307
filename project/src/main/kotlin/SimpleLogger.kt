
class SimpleLogger : Logger {
    override fun log(tag: String, any: Any) {
        println("$tag: ${any.toString()}")
    }
}