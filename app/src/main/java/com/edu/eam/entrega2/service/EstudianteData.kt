package com.edu.eam.entrega2.service

import com.edu.eam.entrega2.model.Estudiante
import java.util.*
import kotlin.collections.ArrayList

object EstudianteData {
    var listaEstudiantes: ArrayList<Estudiante> = ArrayList()

    init {
        val estu1 = Estudiante("007", Date(), "Julián", floatArrayOf(2.5F, 3.5F))
        val estu2 = Estudiante("008", Date(), "Mauricio", floatArrayOf(2.5F, 3.5F))
        val estu3 = Estudiante("009", Date(), "Andrés", floatArrayOf(2.5F, 3.5F))

        listaEstudiantes.add(estu1)
        listaEstudiantes.add(estu2)
        listaEstudiantes.add(estu3)
    }

}