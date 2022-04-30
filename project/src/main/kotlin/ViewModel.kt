import kotlin.properties.Delegates

class ViewModel {

    var currentQuery: String by Delegates.observable("") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }

    val logger: Logger by lazy {
        println("initializing the logger")
        ApplicationLogger(SimpleLogger())
    }

    fun search(query: String) {
        logger.log("query", query)
        currentQuery = query
    }
}