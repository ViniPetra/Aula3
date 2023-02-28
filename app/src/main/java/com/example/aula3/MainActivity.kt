package com.example.aula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valor1: EditText = findViewById(R.id.textValor1)
        val valor2: EditText = findViewById(R.id.textValor2)
        val botaoSomar: Button = findViewById(R.id.buttonSomar)
        val botaoSubtrair: Button = findViewById(R.id.buttonSubtrair)
        val botaoMultiplicar: Button = findViewById(R.id.buttonMultiplicar)
        val botaoDividir: Button = findViewById(R.id.buttonDividir)

        botaoSomar.setOnClickListener{
            var r = valor1.text.toString().toFloat() + valor2.text.toString().toFloat()
            showDialog("Resultado", r.toString())
        }

        botaoSubtrair.setOnClickListener{
            var r = valor1.text.toString().toFloat() - valor2.text.toString().toFloat()
            showDialog("Resultado", r.toString())
        }

        botaoMultiplicar.setOnClickListener{
            var r = valor1.text.toString().toFloat() * valor2.text.toString().toFloat()
            showDialog("Resultado", r.toString())
        }

        botaoDividir.setOnClickListener{
            var r = valor1.text.toString().toFloat() / valor2.text.toString().toFloat()
            showDialog("Resultado", r.toString())
        }

    }

    fun showDialog(title: String, message: String){
        AlertDialog.Builder(this).setTitle(title).setMessage(message).setPositiveButton("OK", null).create().show()
    }
}