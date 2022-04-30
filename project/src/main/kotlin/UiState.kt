

sealed class UiState {
    // loading
    object Loading: UiState()

    // loaded
    data class Loaded(
        val title: String,
        val subtitle: String
    ): UiState()

    // error
    class Error(val error: Throwable): UiState()
}
