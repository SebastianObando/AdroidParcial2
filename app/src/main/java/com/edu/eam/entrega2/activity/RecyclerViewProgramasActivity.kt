package com.edu.eam.entrega2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.adapter.ProgramasAdapter
import com.edu.eam.entrega2.databinding.ActivityRecyclerViewProgramasBinding
import com.edu.eam.entrega2.model.Programa
import com.edu.eam.entrega2.service.ProgramaData


class RecyclerViewProgramasActivity : AppCompatActivity() {

    lateinit var listaProgramas: ArrayList<Programa>

    lateinit var adapter: ProgramasAdapter

    lateinit var binding: ActivityRecyclerViewProgramasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewProgramasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listaProgramas = ProgramaData.listaProgramas
        Log.v("LISTA",listaProgramas[0].toString())
        adapter = ProgramasAdapter(listaProgramas, this)
        binding.listaProgramas.adapter = adapter
        binding.listaProgramas.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_programa, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_agregar -> {
                val intent = Intent(this, CrearProgramaActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}