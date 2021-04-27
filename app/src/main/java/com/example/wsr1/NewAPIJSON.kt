package com.example.wsr1

import com.google.gson.annotations.SerializedName

data class NewAPIJSON(
    @SerializedName("id")
    val taxiId: Int,
    val model: String
)
