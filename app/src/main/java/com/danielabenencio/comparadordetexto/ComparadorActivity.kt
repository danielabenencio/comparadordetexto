package com.danielabenencio.comparadordetexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class ComparadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comparador)

        val editText1 = findViewById<AppCompatEditText>(R.id.editText1)
        val editText2= findViewById<AppCompatEditText>(R.id.editText2)
        val btnCompare = findViewById<AppCompatButton>(R.id.btnCompare)
        val resultTextView= findViewById<AppCompatTextView>(R.id.resultTextView)

       btnCompare.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            if (text1 == text2) {
                resultTextView.text = "Los textos son iguales."
            } else {
                resultTextView.text = "Los textos son diferentes"
            }
        }
    }
}
