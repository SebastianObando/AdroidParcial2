package com.edu.eam.entrega2.service

import com.edu.eam.entrega2.model.EspacioAcademico

object EspacioAcademicoData {
    var listaEspacios: ArrayList<EspacioAcademico> = ArrayList()

    init {
        val espa1 = EspacioAcademico("1", "Matemáticas 1", "3", "Diurna", "4")
        val espa2 = EspacioAcademico("2", "Lógica de programación", "3", "Diurna", "2")
        val espa3 = EspacioAcademico("3", "Lectoescritura", "3", "Diurna", "1")

        listaEspacios.add(espa1)
        listaEspacios.add(espa2)
        listaEspacios.add(espa3)

    }
}