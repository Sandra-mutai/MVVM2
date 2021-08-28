package com.example.cat2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface ApiClient {
    var retrofit: Retrofit
        get() = Retrofit.Builder()
            .baseUrl("<your base url goes here>")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        set(value) = TODO()

    fun <T> buildApiClient(apiInterface: Class<T>) : T{
        return retrofit.create(apiInterface)
    }
}