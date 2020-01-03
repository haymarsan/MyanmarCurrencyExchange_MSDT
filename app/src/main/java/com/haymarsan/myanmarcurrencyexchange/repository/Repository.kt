package com.haymarsan.myanmarcurrencyexchange.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.haymarsan.myanmarcurrencyexchange.data.vos.ExchangeRateVO

interface Repository {

    fun getLatestCurrencyRate(): MutableLiveData<ExchangeRateVO>

}