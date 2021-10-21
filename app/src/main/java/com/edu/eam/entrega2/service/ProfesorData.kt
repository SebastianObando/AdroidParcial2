package com.edu.eam.entrega2.service

import com.edu.eam.entrega2.model.Profesor

object ProfesorData {
    var listaProfesores: ArrayList<Profesor> = ArrayList()

    init {
        val profe1 = Profesor("1", "Alvaro", "3113414749")
        val profe2 = Profesor("2", "Camilo", "3214592838")
        val profe3 = Profesor("3", "Daniel", "3125435211")

        listaProfesores.add(profe1)
        listaProfesores.add(profe2)
        listaProfesores.add(profe3)

    }
}