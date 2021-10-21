package com.edu.eam.entrega2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.adapter.EstudiantesAdapter
import com.edu.eam.entrega2.databinding.ActivityRecyclerViewEstudiantesBinding
import com.edu.eam.entrega2.model.Estudiante
import com.edu.eam.entrega2.service.EstudianteData

class RecyclerViewEstudiantesActivity : AppCompatActivity() {

    lateinit var listaEstudiantes: ArrayList<Estudiante>

    lateinit var binding: ActivityRecyclerViewEstudiantesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewEstudiantesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listaEstudiantes = EstudianteData.listaEstudiantes
        val adapter = EstudiantesAdapter(listaEstudiantes, this)
        binding.listaEstudiantes.adapter = adapter
        binding.listaEstudiantes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.buscador_general, menu)
        return true
    }
}