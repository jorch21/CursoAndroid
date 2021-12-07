package com.example.introduccion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frm_promedio.*

class frmPromedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_promedio)
        calcularPromedio()
    }

    fun calcularPromedio()
    {
        btnVerificar.setOnClickListener()
        {
            var nota1 = 0.0
            var nota2 = 0.0
            var nota3 = 0.0
            var nota4 = 0.0
            var pp = 0.0
            var ep = 0.0
            var ef = 0.0
            var resultado = 0.0
            nota1 = txtNota1.text.toString().toDouble()
            nota2 = txtNota2.text.toString().toDouble()
            nota3 = txtNota3.text.toString().toDouble()
            nota4 = txtNota4.text.toString().toDouble()
            ep = txtParcial.text.toString().toDouble()
            ef = txtFinal.text.toString().toDouble()
            pp = (nota1 + nota2 + nota3 + nota4)/4
            resultado = (pp + ep + ef)/3
            lblMuestra.text = resultado.toString()
        }
    }
}