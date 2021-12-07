package com.example.introduccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frm_datos.*

class frmDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_datos)
        abrirDatos()
    }

    fun abrirDatos(){
        var vlDatos = txtNombreDatos.text.toString()
        val vlAbrirResumen = Intent(this, frmResumen::class.java)
        vlAbrirResumen.putExtra("vtNombre",vlDatos)
        startActivity(vlAbrirResumen)
    }
}