package calculadora

import java.util.*

class Evaluator {
    private val operators = setOf('+', '-', '*', '/', '^', '√', 'e')

    fun evaluatePostfix(tokens: Queue<String>): Double {
        val stack = Stack<Double>()

        for (token in tokens) {
            when {
                token.isDouble() -> stack.push(token.toDouble())
                token.isOperator() -> {
                    val b = stack.pop()
                    val a = if (stack.isNotEmpty() && token[0] != '√') stack.pop() else 0.0
                    stack.push(applyOperator(token[0], a, b))
                }
            }
        }
        return stack.pop()
    }

    private fun applyOperator(op: Char, a: Double, b: Double): Double {
        return when (op) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            '/' -> a / b
            '^' -> Math.pow(a, b)
            '√' -> Math.sqrt(b)
            'e' -> Math.exp(b)
            else -> throw IllegalArgumentException("Unknown operator: $op")
        }
    }

    private fun String.isDouble(): Boolean = this.toDoubleOrNull() != null
    private fun String.isOperator(): Boolean = this.length == 1 && this[0] in operators
}
