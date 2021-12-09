package com.example.introduccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frm_principal.*
import kotlinx.android.synthetic.main.activity_frm_slarios.*

class frmPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_principal)
        abrirCalculadora()
        abrirPromedios()
        abrirCondicional()
        abrirSueldos()
        abrirFuncionesFecha()
        abrirResumenDatos()
        recibirUsuario()
    }

    fun abrirCalculadora()
    {
        btnEjercicio1.setOnClickListener()
        {
            val abrirVentanaCalculadora = Intent(this,frmCalculadora::class.java)
            startActivity(abrirVentanaCalculadora)
        }
    }

    fun abrirPromedios()
    {
        btnEjercicio2.setOnClickListener()
        {
            val abrirVentanaPromedios = Intent(this,frmPromedio::class.java)
            startActivity(abrirVentanaPromedios)
        }
    }

    fun abrirCondicional()
    {
        btnEjercicio3.setOnClickListener()
        {
            val abrirVentanaCondicional = Intent(this,condicionales::class.java)
            startActivity(abrirVentanaCondicional)
        }
    }

    fun abrirSueldos(){
        btnEjercicio4.setOnClickListener(){
            val sueldosBono = Intent(this, frmSlarios::class.java)
            startActivity(sueldosBono)
        }
    }

    fun abrirFuncionesFecha(){
        btnEjercicio5.setOnClickListener(){
            val abrirFecha = Intent(this, frmFecha::class.java)
            startActivity(abrirFecha)
        }
    }

    fun abrirResumenDatos(){
        btnEjercicio6.setOnClickListener(){
            val abrirDatos = Intent(this, frmDatos::class.java)
            startActivity(abrirDatos)
        }
    }

    fun recibirUsuario(){
        val bundle:Bundle? = intent.extras
        val vtUsuario = bundle!!.getString("vtUsuario")
        lblMensajeBienvenida.text = "Bienvenido!!! \nUsuario conectado: $vtUsuario"
    }
}