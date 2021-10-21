package com.edu.eam.entrega2.model

import android.os.Parcel
import android.os.Parcelable

class EspacioAcademico (var codigo: String?, var nombre: String?, var creditos: String?, var modalidad: String?, var semestres: String?): Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(codigo)
        parcel.writeString(nombre)
        parcel.writeString(creditos)
        parcel.writeString(modalidad)
        parcel.writeString(semestres)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EspacioAcademico> {
        override fun createFromParcel(parcel: Parcel): EspacioAcademico {
            return EspacioAcademico(parcel)
        }

        override fun newArray(size: Int): Array<EspacioAcademico?> {
            return arrayOfNulls(size)
        }
    }
}