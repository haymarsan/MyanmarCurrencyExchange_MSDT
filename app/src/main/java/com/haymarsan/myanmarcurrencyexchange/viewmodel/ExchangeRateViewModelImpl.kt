package com.haymarsan.myanmarcurrencyexchange.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.haymarsan.myanmarcurrencyexchange.data.vos.ExchangeRateVO
import com.haymarsan.myanmarcurrencyexchange.repository.RepositoryImpl

class ExchangeRateViewModelImpl(application: Application): AndroidViewModel(application), ExchangeRateViewModel {


    private val repository = RepositoryImpl(application)
    private lateinit var exchangeRateList: MutableLiveData<ExchangeRateVO>

    override fun getExchangeRate(): LiveData<ExchangeRateVO> {
        exchangeRateList = repository.getLatestCurrencyRate()

        return exchangeRateList
    }
}