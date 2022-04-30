

fun main() {
    println(NetworkConfig.baseUrl)
    println(NetworkConfig.getNetworkDetails())

    val provider: NetworkInfoProvider = object : NetworkInfoProvider {
        override fun getNetworkDetails(): String {
            TODO("Not yet implemented")
        }
    }
    provider.getNetworkDetails()
}