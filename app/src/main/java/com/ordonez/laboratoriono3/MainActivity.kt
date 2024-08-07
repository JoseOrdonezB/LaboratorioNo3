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

        buttonEqual.setOnClickListener {
            val expression = cuentaText.text.toString()
            try {
                val result = calculator.evaluate(expression)
                cuentaText.setText(result.toString())
            } catch (e: Exception) {
                cuentaText.setText("Error")
            }
        }

        buttonOne.setOnClickListener {
            cuentaText.append("1")
        }

        buttonTwo.setOnClickListener {
            cuentaText.append("2")
        }

        buttonThree.setOnClickListener {
            cuentaText.append("3")
        }

        buttonFour.setOnClickListener {
            cuentaText.append("4")
        }

        buttonFive.setOnClickListener {
            cuentaText.append("5")
        }

        buttonSix.setOnClickListener {
            cuentaText.append("6")
        }

        buttonSeven.setOnClickListener {
            cuentaText.append("7")
        }

        buttonEight.setOnClickListener {
            cuentaText.append("8")
        }

        buttonNine.setOnClickListener {
            cuentaText.append("9")
        }

        buttonZero.setOnClickListener {
            cuentaText.append("0")
        }

        buttonAdd.setOnClickListener {
            cuentaText.append("+")
        }

        buttonSub.setOnClickListener {
            cuentaText.append("-")
        }

        buttonMult.setOnClickListener {
            cuentaText.append("*")
        }

        buttonDiv.setOnClickListener {
            cuentaText.append("/")
        }

        buttonExp.setOnClickListener {
            cuentaText.append("^")
        }

        buttonRaiz.setOnClickListener {
            cuentaText.append("√")
        }

        buttonLParent.setOnClickListener {
            cuentaText.append("(")
        }

        buttonRParent.setOnClickListener {
            cuentaText.append(")")
        }

        buttonBack.setOnClickListener {
            val currentText = cuentaText.text.toString()
            if (currentText.isNotEmpty()) {
                cuentaText.setText(currentText.dropLast(1))
                cuentaText.setSelection(cuentaText.text.length)
            }
        }

    }
}
