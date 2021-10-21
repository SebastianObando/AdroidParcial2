package com.edu.eam.entrega2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.activity.InfoEstudianteActivity
import com.edu.eam.entrega2.activity.InfoProfesorActivity
import com.edu.eam.entrega2.model.Estudiante

class EstudiantesAdapter(var lista: ArrayList<Estudiante>, var context: Context): RecyclerView.Adapter<EstudiantesAdapter.ViewHolder>() {

    inner class ViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {

        val codigo: TextView = itemView.findViewById(R.id.codigo_estudiante)
        val nombre: TextView = itemView.findViewById(R.id.nombre_profesor)

        init {
            itemView.setOnClickListener(this)
        }

        fun bindEstudiante(estudiante: Estudiante) {
            codigo.text = estudiante.codigo
            nombre.text = estudiante.nombre
        }

        override fun onClick(p0: View?) {
            val intent = Intent(context, InfoEstudianteActivity::class.java)
            context.startActivity(intent)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstudiantesAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_estudiante, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: EstudiantesAdapter.ViewHolder, position: Int) {
        holder.bindEstudiante(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }

}