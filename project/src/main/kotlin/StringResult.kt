// Create a sealed class called StringResult
// StringResult should have 2 possible states
//    Success
//    Error
// StringResult.Success should have a public String property
// StringResult.Error should have a public Throwable property

sealed class StringResult {
    data class Success(val value: String): StringResult()
    data class Error(val error: Throwable): StringResult()
}