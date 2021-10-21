package com.edu.eam.entrega2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.activity.InfoProfesorActivity
import com.edu.eam.entrega2.model.Profesor

class ProfesoresAdapter(var lista: ArrayList<Profesor>, var context: Context): RecyclerView.Adapter<ProfesoresAdapter.ViewHolder>(), Filterable {

    inner class ViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {

        val codigo: TextView = itemView.findViewById(R.id.codigo_profesor)
        val nombre: TextView = itemView.findViewById(R.id.nombre_profesor)
        val numero: TextView = itemView.findViewById(R.id.numero_profesor)

        init {
            itemView.setOnClickListener(this)
        }

        fun bindProfesor(profesor: Profesor) {
            codigo.text = profesor.codigo
            nombre.text = profesor.nombre
            numero.text = profesor.numero
        }

        override fun onClick(p0: View?) {
            val intent = Intent(context, InfoProfesorActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfesoresAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_profesor, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ProfesoresAdapter.ViewHolder, position: Int) {
        holder.bindProfesor(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun getFilter(): Filter {
        TODO("Not yet implemented")
    }

}