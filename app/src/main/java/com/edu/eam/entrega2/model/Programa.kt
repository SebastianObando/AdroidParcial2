package com.edu.eam.entrega2.model

import android.os.Parcel
import android.os.Parcelable

class Programa(var codigo: String?,var name: String?, var snies: String?, var faculty: String?) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(codigo)
        parcel.writeString(name)
        parcel.writeString(snies)
        parcel.writeString(faculty)
    }

    override fun toString(): String {
        return "Nombre: "+this.name
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Programa> {
        override fun createFromParcel(parcel: Parcel): Programa {
            return Programa(parcel)
        }

        override fun newArray(size: Int): Array<Programa?> {
            return arrayOfNulls(size)
        }
    }
}