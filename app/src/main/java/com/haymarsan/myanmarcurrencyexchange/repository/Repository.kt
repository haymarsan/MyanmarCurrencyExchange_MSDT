package com.hms.currencyexchange.repository

import androidx.lifecycle.MutableLiveData
import com.haymarsan.myanmarcurrencyexchange.data.vos.ExchangeRateVO
interface Repository {

    fun getLatestRate():MutableLiveData<ExchangeRateVO>





}