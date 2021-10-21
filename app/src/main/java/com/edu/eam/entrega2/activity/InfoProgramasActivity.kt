package com.edu.eam.entrega2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.databinding.ActivityInfoProgramasBinding

class InfoProgramasActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityInfoProgramasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInfoProgramasBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnListaEstudiantes.setOnClickListener(this)
        binding.btnListaProfesores.setOnClickListener(this)
        binding.btnListaEspaciosAcademicos.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        Log.v("TAG", "Mensaje")
        when(v?.id) {
            binding.btnListaProfesores.id -> {
                //Log.v("MENSAJE", "Mensaje")
                val intent = Intent(this,RecyclerViewProfesoresActivity::class.java)
                startActivity(intent)
            }

            binding.btnListaEspaciosAcademicos.id -> {
                val intent = Intent(this, RecyclerViewEspaciosAcademicosActivity::class.java)
                startActivity(intent)
            }

            binding.btnListaEstudiantes.id -> {
                val intent = Intent(this, RecyclerViewEstudiantesActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun irListaProfesores(view: View) {
        val intent = Intent(this,RecyclerViewProfesoresActivity::class.java)
        startActivity(intent)
    }
}