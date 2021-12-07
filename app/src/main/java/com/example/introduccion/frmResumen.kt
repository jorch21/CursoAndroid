package com.example.introduccion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frm_resumen.*

class frmResumen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_resumen)

        val bundle:Bundle? = intent.extras
        var vtNombre = bundle!!.getString("vtNombre")
        lblResumen.text = vtNombre
    }
}