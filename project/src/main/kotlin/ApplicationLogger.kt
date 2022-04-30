
class ApplicationLogger(
    private val delegate: Logger
) : Logger by delegate