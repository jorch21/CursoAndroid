package com.example.introduccion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frm_calculadora.*

class frmCalculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_calculadora)
        fcnOperaciones()
    }

    fun fcnOperaciones()
    {
        btnSuma.setOnClickListener()
        {
            var numero1 = 0.0
            var numero2 = 0.0
            var resultado = 0.0
            numero1 = txtNumeroUno.text.toString().toDouble()
            numero2 = txtNumeroDos.text.toString().toDouble()
            resultado = numero1 + numero2
            lblResultado.text = resultado.toString()
        }
        btnResta.setOnClickListener()
        {
            var numero1 = 0.0
            var numero2 = 0.0
            var resultado = 0.0
            numero1 = txtNumeroUno.text.toString().toDouble()
            numero2 = txtNumeroDos.text.toString().toDouble()
            resultado = numero1 - numero2
            lblResultado.text = resultado.toString()
        }
        btnMultiplicar.setOnClickListener()
        {
            var numero1 = 0.0
            var numero2 = 0.0
            var resultado = 0.0
            numero1 = txtNumeroUno.text.toString().toDouble()
            numero2 = txtNumeroDos.text.toString().toDouble()
            resultado = numero1 * numero2
            lblResultado.text = resultado.toString()
        }
        btnDividir.setOnClickListener()
        {
            var numero1 = 0.0
            var numero2 = 0.0
            var resultado = 0.0
            numero1 = txtNumeroUno.text.toString().toDouble()
            numero2 = txtNumeroDos.text.toString().toDouble()
            resultado = numero1 / numero2
            lblResultado.text = resultado.toString()
        }
    }


}