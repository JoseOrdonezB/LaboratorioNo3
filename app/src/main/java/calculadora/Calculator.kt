package calculadora

class Calculator {
    private val tokenizer = Tokenizer()
    private val shuntingYard = ShuntingYard()
    private val evaluator = Evaluator()

    fun evaluate(expression: String): Double {
        val tokens = tokenizer.tokenize(expression)
        val postfix = shuntingYard.toPostfix(tokens)
        return evaluator.evaluatePostfix(postfix)
    }
}
