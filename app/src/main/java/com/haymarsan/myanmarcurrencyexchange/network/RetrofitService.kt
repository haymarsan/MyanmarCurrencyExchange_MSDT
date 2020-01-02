package com.haymarsan.myanmarcurrencyexchange.network

import com.haymarsan.myanmarcurrencyexchange.utils.utils
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    val retrofit = Retrofit.Builder()
        .baseUrl(utils.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun <S> createServic (serviceClass: Class<S>):S{
        return retrofit.create(serviceClass)
    }

}