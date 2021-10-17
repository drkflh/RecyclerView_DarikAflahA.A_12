package com.recyclerview_darikaflahaa_12

import android.os.Parcel
import android.os.Parcelable

data class mobil(val foto: Int, val nama: String?, val deskripsi: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foto)
        parcel.writeString(nama)
        parcel.writeString(deskripsi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<mobil> {
        override fun createFromParcel(parcel: Parcel): mobil {
            return mobil(parcel)
        }

        override fun newArray(size: Int): Array<mobil?> {
            return arrayOfNulls(size)
        }
    }
}