
object NetworkConfig : NetworkInfoProvider {
    val baseUrl = "http://<some url>"
    val userAgent = "demo-app"

    override fun getNetworkDetails(): String {
        return "$baseUrl - $userAgent"
    }
}