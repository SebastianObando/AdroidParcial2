package com.edu.eam.entrega2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.adapter.ProfesoresAdapter
import com.edu.eam.entrega2.databinding.ActivityRecyclerViewProfesoresBinding
import com.edu.eam.entrega2.model.Profesor
import com.edu.eam.entrega2.service.ProfesorData

class RecyclerViewProfesoresActivity : AppCompatActivity() {

    lateinit var listaProfesores: ArrayList<Profesor>

    lateinit var binding: ActivityRecyclerViewProfesoresBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewProfesoresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listaProfesores = ProfesorData.listaProfesores
        val adapter = ProfesoresAdapter(listaProfesores, this)
        binding.listaProfesores.adapter = adapter
        binding.listaProfesores.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_programa, menu)
        return true
    }

}