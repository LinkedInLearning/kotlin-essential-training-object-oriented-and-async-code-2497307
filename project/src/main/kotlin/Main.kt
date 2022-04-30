
fun render(state: UiState) = when (state) {
    is UiState.Error -> println("Error")
    is UiState.Loaded -> println("Loaded: ${state.title}")
    UiState.Loading -> println("Loading")
}

fun main() {
    var state: UiState = UiState.Loading
    render(state)

    state = UiState.Loaded("Kotlin", "Is cool!")
    render(state)

    state = UiState.Error(IllegalStateException())
    render(state)
}