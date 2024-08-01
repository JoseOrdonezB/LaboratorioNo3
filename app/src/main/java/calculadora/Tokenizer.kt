package calculadora

class Tokenizer {
    private val regex = Regex("""(\d+(\.\d+)?)|([+\-*/()])|(\s+)""")

    fun tokenize(expression: String): List<String> {
        return regex.findAll(expression).map { it.value }.filter { it.isNotBlank() }.toList()
    }
}
