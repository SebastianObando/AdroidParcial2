package com.edu.eam.entrega2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.adapter.EspacioAcademicoAdapter
import com.edu.eam.entrega2.databinding.ActivityRecyclerViewEspaciosAcademicosBinding
import com.edu.eam.entrega2.model.EspacioAcademico
import com.edu.eam.entrega2.service.EspacioAcademicoData

class RecyclerViewEspaciosAcademicosActivity : AppCompatActivity() {

    lateinit var listaEspacios: ArrayList<EspacioAcademico>

    lateinit var binding: ActivityRecyclerViewEspaciosAcademicosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewEspaciosAcademicosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listaEspacios = EspacioAcademicoData.listaEspacios
        val adapter = EspacioAcademicoAdapter(listaEspacios, this)
        binding.listaEspaciosAcademicos.adapter = adapter
        binding.listaEspaciosAcademicos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.buscador_general, menu)
        return true
    }
}