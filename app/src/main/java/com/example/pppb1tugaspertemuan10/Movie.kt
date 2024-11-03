package com.example.pppb1tugaspertemuan10

import android.os.Parcel
import android.os.Parcelable

data class Movie(
    val title: String,
    val genre: String,
    val duration: String,
    val poster: Int,
    val synopsis: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(genre)
        parcel.writeString(duration)
        parcel.writeInt(poster)
        parcel.writeString(synopsis)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}
