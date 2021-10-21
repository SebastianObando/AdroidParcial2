package com.edu.eam.entrega2.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edu.eam.entrega2.R
import com.edu.eam.entrega2.activity.InfoProgramasActivity
import com.edu.eam.entrega2.model.Programa

class ProgramasAdapter(var lista:ArrayList<Programa>, var context: Context): RecyclerView.Adapter<ProgramasAdapter.ViewHolder>(), Filterable {

    inner class ViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val name: TextView = itemView.findViewById(R.id.nombre_programa)
        val snies: TextView = itemView.findViewById(R.id.snies_programa)
        val faculty: TextView = itemView.findViewById(R.id.facultad_programa)


        init{
            itemView.setOnClickListener(this)
        }

        fun bindPrograma(programa: Programa) {
            name.text = programa.name
            snies.text = programa.snies
            faculty.text = programa.faculty
        }

        override fun onClick(v: View?) {
            Log.v("PROGRAMA", name?.text.toString()+" "+adapterPosition)
            //val intent = Intent(context,RecyclerViewProfesoresActivity::class.java)
            //context.startActivity(intent)
            val intent = Intent(context, InfoProgramasActivity::class.java)
            context.startActivity(intent)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramasAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_programa, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ProgramasAdapter.ViewHolder, position: Int) {
        holder.bindPrograma(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun getFilter(): Filter {
        TODO("Not yet implemented")
    }
}