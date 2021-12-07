package com.example.introduccion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_condicionales.*
import kotlinx.android.synthetic.main.activity_frm_promedio.*

class condicionales : AppCompatActivity() {
    var vlMensaje: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condicionales)
        //numeroDosis(0)
        mayorEdad(0)
    }

    fun mayorEdad(vlEdad: Int) {
        btnVerificarResultado.setOnClickListener() {

            var vlEdad = if(txtEdad.text.toString()=="")0 else txtEdad.text.toString().toInt()
            if (vlEdad > 18) {
                vlMensaje = "Es mayor de edad "
                numeroDosis(0)
            } else {
                vlMensaje = "Es menor de edad "
                numeroDosis(0)
            }

        }
    }

    fun numeroDosis(paramDosis: Int){
        btnVerificarResultado.setOnClickListener(){
            var paramDosis = if (txtNumeroDosis.text.toString()=="")0 else txtNumeroDosis.text.toString().toInt()
            when(paramDosis){
                0 -> { vlMensaje = vlMensaje + "- No tiene ninguna vacuna"}
                1 -> { vlMensaje = vlMensaje + "- Debe vacunarse por seguna ocasion"}
                2 -> { vlMensaje = vlMensaje + "- Si tiene mas de 5 meses le corresponde la tercera dosis"}
                3 -> { vlMensaje = vlMensaje + "- Tiene las dosis completas"}
                else ->{ Toast.makeText(this, "Solo se aplican a 3 dosis", Toast.LENGTH_SHORT).show()}
            }
            lblMensajeResultado.text = vlMensaje
        }

    }
}