package com.hms.currencyexchange.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import com.haymarsan.myanmarcurrencyexchange.data.room.CurrencyEntity
import com.haymarsan.myanmarcurrencyexchange.data.vos.ExchangeRateVO

interface ExchangeRateViewModel {

    fun getAllCurrency(): LiveData<List<CurrencyEntity>>

    fun getExchangeRate(): LiveData<ExchangeRateVO>



    fun insertCurrency(currencyEntity: CurrencyEntity)

    fun updateCurrency(currencyEntity: CurrencyEntity)

    fun deleteCurrency(currencyEntity: CurrencyEntity)

    fun deleteAllCurrency()

}