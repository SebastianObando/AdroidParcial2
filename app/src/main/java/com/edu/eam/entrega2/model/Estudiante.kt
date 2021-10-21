package com.edu.eam.entrega2.model

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class Estudiante (var codigo: String?, var fechaNacimiento: Date, var nombre: String?, var notas: FloatArray?) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        TODO("fechaNacimiento"),
        parcel.readString(),
        parcel.createFloatArray()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(codigo)
        parcel.writeString(nombre)
        parcel.writeFloatArray(notas)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Estudiante> {
        override fun createFromParcel(parcel: Parcel): Estudiante {
            return Estudiante(parcel)
        }

        override fun newArray(size: Int): Array<Estudiante?> {
            return arrayOfNulls(size)
        }
    }
}