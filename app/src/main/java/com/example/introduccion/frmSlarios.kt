package com.example.introduccion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_frm_slarios.*

class frmSlarios : AppCompatActivity() {
    var mensaje = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_slarios)

        mostrarBono(0)
    }

    fun mostrarBono(valorSueldo: Int) {
        btnCalcular.setOnClickListener() {
            var nombre = ""
            var bono = 0

            nombre = txtNombreTrabajador.text.toString()
            if (txtSueldo.text.isNotEmpty() && txtNombreTrabajador.text.isNotEmpty()) {
                var valorSueldo = txtSueldo.text.toString().toInt()
                if (valorSueldo < 1000) {
                    bono = 250
                } else if (valorSueldo >= 1000 && valorSueldo < 2000) {
                    bono = 200
                } else if (valorSueldo >= 2000 && valorSueldo < 4400) {
                    bono = 100
                } else if (valorSueldo > 4400) {
                    bono = 0
                } else {
                    Toast.makeText(this, "No existe dicho rango", Toast.LENGTH_SHORT).show()
                }
                valorSueldo = valorSueldo + bono
                mensaje =
                    "Estimado(a) " + nombre + " su bono es " + bono + " y su salario total es " + valorSueldo
                lblResultadoSueldo.text = mensaje
            }else {
                Toast.makeText(this, "No deje campos vacíos", Toast.LENGTH_SHORT).apply {
                    setGravity(Gravity.CENTER, 0, 0)
                    show()
                }
            }
        }
    }
}