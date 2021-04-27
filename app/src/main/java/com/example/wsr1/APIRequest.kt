package com.example.wsr1

import retrofit2.http.GET

interface APIRequest {

    @GET("cars")
    suspend fun getCars() : NewAPIJSON
}