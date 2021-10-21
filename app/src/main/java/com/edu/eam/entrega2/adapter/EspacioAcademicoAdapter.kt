package com.edu.eam.entrega2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.activity.InfoEspacioAcademicoActivity
import com.edu.eam.entrega2.activity.InfoEstudianteActivity
import com.edu.eam.entrega2.model.EspacioAcademico

class EspacioAcademicoAdapter(var lista: ArrayList<EspacioAcademico>, var context: Context): RecyclerView.Adapter<EspacioAcademicoAdapter.ViewHolder>() {

    inner class ViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val codigo: TextView = itemView.findViewById(R.id.codigo_espacio)
        val nombre: TextView = itemView.findViewById(R.id.nombre_espacio)
        val creditos: TextView = itemView.findViewById(R.id.creditos_espacio)

        init {
            itemView.setOnClickListener(this)
        }

        fun bindEspacio(espacioAcademico: EspacioAcademico) {
            codigo.text = espacioAcademico.codigo
            nombre.text = espacioAcademico.nombre
            creditos.text = espacioAcademico.creditos
        }

        override fun onClick(p0: View?) {
            val intent = Intent(context, InfoEspacioAcademicoActivity::class.java)
            context.startActivity(intent)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_espacio_academico, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindEspacio(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }


}