package com.edu.eam.entrega2.service

import com.edu.eam.entrega2.model.Programa

object ProgramaData {
    var listaProgramas: ArrayList<Programa> = ArrayList()

    init {
        val pro1 = Programa("1", "Ingeniería de software", "123", "Ingeniería")
        val pro2 = Programa("2", "Ingeniería mecatrónica", "123", "Ingeniería")
        val pro3 = Programa("3", "Ingeniería industrial", "123", "Ingeniería")

        listaProgramas.add(pro1)
        listaProgramas.add(pro2)
        listaProgramas.add(pro3)
    }

    fun agregar(programa: Programa) {
        listaProgramas.add(0, programa)
    }

    fun eliminar(codigo: String) {
        for (p in listaProgramas) {
            if (p.codigo == codigo) {
                listaProgramas.remove(p)
                break
            }
        }
    }

    fun obtener(codigo: String): Programa? {
        return listaProgramas.firstOrNull{ programa -> programa.codigo == codigo }
    }

    fun modificar(programa: Programa) {
        for ((i, e) in listaProgramas.withIndex()) {
            if (e.codigo == programa.codigo) {
                listaProgramas[i] = programa
                break
            }
        }
    }

}