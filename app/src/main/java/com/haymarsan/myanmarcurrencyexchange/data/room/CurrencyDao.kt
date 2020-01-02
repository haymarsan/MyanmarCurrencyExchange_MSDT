package com.haymarsan.myanmarcurrencyexchange.data.room

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface CurrencyDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurrency(currencyEntity: CurrencyEntity)


    @Update
    fun updateCurrency(currencyEntity: CurrencyEntity)


    @Delete
    fun deleteCurrency(currencyEntity: CurrencyEntity)


    @Query("DELETE FROM currency_table")
    fun deleteAllCurrency()


    @Query("SELECT * FROM currency_table")
    fun getAllCurrencyList(): LiveData<List<CurrencyEntity>>

}