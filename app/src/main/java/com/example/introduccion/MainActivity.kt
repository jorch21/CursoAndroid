package com.example.introduccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AbrirVentana()
    }

    fun AbrirVentana()
    {
        /*var para variables y val para constantes*/
        btnIngresar.setOnClickListener()
        {
            val vlObjAbrirVentana = Intent(this,frmPrincipal::class.java)
            startActivity(vlObjAbrirVentana)
        }

    }
}