package com.haymarsan.myanmarcurrencyexchange.repository

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.haymarsan.myanmarcurrencyexchange.data.room.CurrencyDB
import com.haymarsan.myanmarcurrencyexchange.data.vos.ExchangeRateVO
import com.haymarsan.myanmarcurrencyexchange.network.CurrencyApi
import com.haymarsan.myanmarcurrencyexchange.network.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryImpl(application: Application) : Repository {

    private val currencyDB = CurrencyDB.getDatabase(application)
    private val mCurrencyDao = currencyDB.currencyDao()
    private val allCurrency =  mCurrencyDao.getAllCurrencyList()


    lateinit var mApi: CurrencyApi


    init {
        mApi = RetrofitService().createServic(CurrencyApi::class.java)
    }


    override fun getLatestCurrencyRate(): MutableLiveData<ExchangeRateVO> {
        var exchangeRate = MutableLiveData<ExchangeRateVO>()

        mApi.getExchangeRate().enqueue(object : Callback<ExchangeRateVO>{
            override fun onFailure(call: Call<ExchangeRateVO>, t: Throwable) {
                Log.i("Error", t.message.toString())

                exchangeRate.value = null

            }

            override fun onResponse(
                call: Call<ExchangeRateVO>,
                response: Response<ExchangeRateVO>
            ) {
                    if (response.isSuccessful){
                        exchangeRate.value = response.body()
                    }
            }

        })
        return exchangeRate
    }
}