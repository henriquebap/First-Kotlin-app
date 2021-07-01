package com.henriquebap77.kotlin_app

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao : Button = botao
        val resultado :TextView = Resultado

        botao.setOnClickListener{

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val faltas = Integer.parseInt(faltas.text.toString())
            val media = ( nota1 + nota2 )/2

            if(media >=5 && faltas <= 12){
                resultado.setText("Parabens! Voce foi aprovado" + "\n" + "Sua Media foi: " + media + "\n" + "Voce faltou: " + faltas)
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("Infelizmente voce foi reporvado" + "\n" + " Nota final: " + media + "\n" + "Voce Faltou: " + faltas)
                resultado.setTextColor(Color.RED)
            }
        }



    }
}