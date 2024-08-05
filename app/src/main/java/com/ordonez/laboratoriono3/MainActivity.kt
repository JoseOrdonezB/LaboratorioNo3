package com.ordonez.laboratoriono3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import calculadora.Calculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a EditText y Botones
        val cuentaText: EditText = findViewById(R.id.cuentaText)
        val buttonOne: Button = findViewById(R.id.oneButton)
        val buttonTwo: Button = findViewById(R.id.twoButton)
        val buttonThree: Button = findViewById(R.id.threeButton)
        val buttonFour: Button = findViewById(R.id.fourButton)
        val buttonFive: Button = findViewById(R.id.fiveButton)
        val buttonSix: Button = findViewById(R.id.sixButton)
        val buttonSeven: Button = findViewById(R.id.sevenButton)
        val buttonEight: Button = findViewById(R.id.eightButton)
        val buttonNine: Button = findViewById(R.id.nineButton)
        val buttonZero: Button = findViewById(R.id.zeroButton)
        val buttonRParent: Button = findViewById(R.id.parentRButton)
        val buttonLParent: Button = findViewById(R.id.parentLButton)
        val buttonAdd: Button = findViewById(R.id.addButton)
        val buttonSub: Button = findViewById(R.id.subButton)
        val buttonMult: Button = findViewById(R.id.multButton)
        val buttonDiv: Button = findViewById(R.id.divButton)
        val buttonExp: Button = findViewById(R.id.expButton)
        val buttonRaiz: Button = findViewById(R.id.raizButton)
        val buttonBack: Button = findViewById(R.id.backButton)
        val buttonEqual: Button = findViewById(R.id.equalButton)

        val calculator = Calculator()

        // Configurar el evento de clic para el botón "Equal"
        buttonEqual.setOnClickListener {
            val expression = cuentaText.text.toString()  // Obtener la expresión del EditText
            try {
                val result = calculator.evaluate(expression)  // Evaluar la expresión
                cuentaText.setText(result.toString())  // Mostrar el resultado en el EditText
            } catch (e: Exception) {
                cuentaText.setText("Error")  // Mostrar "Error" si hay una excepción
            }
        }


        // Configurar el evento de clic para el botón "1"
        buttonOne.setOnClickListener {
            cuentaText.append("1")
        }

        // Configurar el evento de clic para el botón "2"
        buttonTwo.setOnClickListener {
            cuentaText.append("2")
        }

        // Configurar el evento de clic para el botón "3"
        buttonThree.setOnClickListener {
            cuentaText.append("3")
        }

        // Configurar el evento de clic para el botón "4"
        buttonFour.setOnClickListener {
            cuentaText.append("4")
        }

        // Configurar el evento de clic para el botón "5"
        buttonFive.setOnClickListener {
            cuentaText.append("5")
        }

        // Configurar el evento de clic para el botón "6"
        buttonSix.setOnClickListener {
            cuentaText.append("6")
        }

        // Configurar el evento de clic para el botón "7"
        buttonSeven.setOnClickListener {
            cuentaText.append("7")
        }

        // Configurar el evento de clic para el botón "8"
        buttonEight.setOnClickListener {
            cuentaText.append("8")
        }

        // Configurar el evento de clic para el botón "9"
        buttonNine.setOnClickListener {
            cuentaText.append("9")
        }

        // Configurar el evento de clic para el botón "0"
        buttonZero.setOnClickListener {
            cuentaText.append("0")
        }

        // Configurar el evento de clic para el botón "+"
        buttonAdd.setOnClickListener {
            cuentaText.append("+")
        }

        // Configurar el evento de clic para el botón "-"
        buttonSub.setOnClickListener {
            cuentaText.append("-")
        }

        // Configurar el evento de clic para el botón "*"
        buttonMult.setOnClickListener {
            cuentaText.append("*")
        }

        // Configurar el evento de clic para el botón "/"
        buttonDiv.setOnClickListener {
            cuentaText.append("/")
        }

        // Configurar el evento de clic para el botón "^"
        buttonExp.setOnClickListener {
            cuentaText.append("^")
        }

        // Configurar el evento de clic para el botón "√"
        buttonRaiz.setOnClickListener {
            cuentaText.append("√")
        }

        // Configurar el evento de clic para el botón "("
        buttonLParent.setOnClickListener {
            cuentaText.append("(")
        }

        // Configurar el evento de clic para el botón ")"
        buttonRParent.setOnClickListener {
            cuentaText.append(")")
        }

        buttonBack.setOnClickListener {
            val currentText = cuentaText.text.toString()
            if (currentText.isNotEmpty()) {
                cuentaText.setText(currentText.dropLast(1))
                // Mueve el cursor al final del texto
                cuentaText.setSelection(cuentaText.text.length)
            }
        }

    }
}
