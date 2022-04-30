
interface StringProvider {

    val placeholder: String

    fun getString(id: Int): String = id.toString()
}

interface ResourceProvider : StringProvider {
    fun getDimension(id: Int): Long = id.toLong()
}

class DefaultResourceProvider : ResourceProvider {

    override val placeholder: String = "<placeholder>"
}

fun main() {
    val someVariable: Any? = null
    if (someVariable is StringProvider) {
        println("The variable was a StringProvider")
    }

    var stringProvider: StringProvider = DefaultResourceProvider()
    println(stringProvider.getString(5))
    println(stringProvider.placeholder)
}