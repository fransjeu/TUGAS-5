package com.example.uas_frans_18411028

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataModel (
    val iconsImage :Int,
    val titleImage :String,
    val DescImage :String
    ) : Parcelable