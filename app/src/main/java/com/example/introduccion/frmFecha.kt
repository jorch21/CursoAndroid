package com.example.introduccion

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_frm_fecha.*
import java.text.SimpleDateFormat
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import java.util.*

class frmFecha : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_fecha)
        fechaActual()
        obtenerFechaControl()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun fechaActual(){

        //val sdf = SimpleDateFormat("dd/M/yyyy")
        //val fechaHoy = sdf.format(Date())
        //lblFechaActual.text = fechaHoy
        val vlFechaActual = LocalDate.now().toString()
        lblFechaActual.text = vlFechaActual
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun obtenerFechaControl(){
        calendPrincipal.setOnDateChangeListener { calendPrincipal, a, m, d ->
            val vlAnio = a
            val vlAnioActual = LocalDate.now().year
            var vlEdad = vlAnioActual - vlAnio
            var mes = m + 1
            lblEdad.text = vlEdad.toString()

            var vlFechaCalendario = LocalDate.parse("$a-$mes-$d")
            var vlFechaActual = LocalDate.now()

            //var vlDiffDias = ChronoUnit.DAYS.between(vlFechaActual,vlFechaCalendario)
            //var vlDiffDias = Duration.between(vlFechaActual,vlFechaCalendario).toDays()
            //var vlDiffDias = vlFechaActual.until(vlFechaCalendario, ChronoUnit.DAYS)

            lblFecNac.text = vlFechaCalendario.toString()

            Toast.makeText(this, "La diferencia entre los dias es $vlFechaCalendario", Toast.LENGTH_SHORT).apply {
                setGravity(Gravity.CENTER, 0, 0)
                show()
            }
        }
    }
}