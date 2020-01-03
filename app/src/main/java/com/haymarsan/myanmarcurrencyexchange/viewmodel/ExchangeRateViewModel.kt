package com.haymarsan.myanmarcurrencyexchange.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import com.haymarsan.myanmarcurrencyexchange.data.vos.ExchangeRateVO


interface ExchangeRateViewModel {

    fun getExchangeRate(): LiveData<ExchangeRateVO>


}