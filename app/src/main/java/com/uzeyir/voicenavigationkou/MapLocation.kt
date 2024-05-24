package com.uzeyir.voicenavigationkou


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MapLocation(var placeLatitude:Double, var placeLongitude:Double): Parcelable
