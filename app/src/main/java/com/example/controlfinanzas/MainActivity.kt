package com.example.controlfinanzas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var tvTotalIngresos: TextView
    lateinit var tvTotalGastos: TextView
    lateinit var tvBalanceActual: TextView
    lateinit var btnIngresarEntrada: Button
    lateinit var btnIngresarGasto: Button
    lateinit var btnVerHistorial: Button
   // lateinit var db: DatabaseHelper//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTotalIngresos = findViewById(R.id.tvTotalIngresos)
        tvTotalGastos = findViewById(R.id.tvTotalGastos)
        tvBalanceActual = findViewById(R.id.tvBalanceActual)
        btnIngresarEntrada = findViewById(R.id.btnIngresarEntrada)
        btnIngresarGasto = findViewById(R.id.btnIngresarGasto)
        //btnVerHistorial = findViewById(R.id.btnVerHistorial)

        //db = DatabaseHelper(this)
        actualizarValores()

        btnIngresarEntrada.setOnClickListener {
            val intent = Intent(this, IngresarEntrada::class.java)
            intent.putExtra("tipo", "Ingreso")
            startActivity(intent)
        }

        // Botón para ingresar gasto
        btnIngresarGasto.setOnClickListener {
            val intent = Intent(this, IngresarGasto::class.java)
            intent.putExtra("tipo", "Gasto")
            startActivity(intent)
        }

        // Botón para ver el historial de transacciones
        btnVerHistorial.setOnClickListener {
            val intent = Intent(this, Historial::class.java)
            startActivity(intent)
        }
    }

    private fun actualizarValores() {
        // Obtener totales de ingresos y gastos
       // val totalIngresos = db.getTotalIngresosPorMes(10) // Mes actual
        //val totalGastos = db.getTotalGastosPorMes(10)

        // Actualizar TextViews
       // tvTotalIngresos.text = "Total Ingresos: $${totalIngresos}"
        //tvTotalGastos.text = "Total Gastos: $${totalGastos}"
        //tvBalanceActual.text = "Balance Actual: $${totalIngresos - totalGastos}"
    }
}
