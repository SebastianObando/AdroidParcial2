package com.edu.eam.entrega2.model

import android.os.Parcel
import android.os.Parcelable

class Profesor(var codigo: String?, var nombre: String?, var numero: String?) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(codigo)
        parcel.writeString(nombre)
        parcel.writeString(numero)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Profesor> {
        override fun createFromParcel(parcel: Parcel): Profesor {
            return Profesor(parcel)
        }

        override fun newArray(size: Int): Array<Profesor?> {
            return arrayOfNulls(size)
        }
    }
}