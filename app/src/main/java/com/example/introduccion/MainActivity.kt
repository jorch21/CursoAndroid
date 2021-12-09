package com.example.introduccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
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
            if (txtUsuario.text.isEmpty() || txtPassword.text.isEmpty()){

                Toast.makeText(this,"Por favor complete los campos!!",Toast.LENGTH_SHORT).apply {
                    setGravity(Gravity.CENTER, 0 , 0)
                    show()
                }

            }else{

                if (txtUsuario.text.toString().equals("Administrador") && txtPassword.text.toString().equals("admin")){

                    val usuario = txtUsuario.text.toString()
                    val vlObjAbrirVentana = Intent(this,frmPrincipal::class.java)
                    vlObjAbrirVentana.putExtra("vtUsuario",usuario)
                    startActivity(vlObjAbrirVentana)

                }else{

                    Toast.makeText(this,"Usuario o Contraseña erroneos!!",Toast.LENGTH_SHORT).apply {
                        setGravity(Gravity.CENTER, 0 , 0)
                        show()
                    }

                }

            }

        }
    }
}