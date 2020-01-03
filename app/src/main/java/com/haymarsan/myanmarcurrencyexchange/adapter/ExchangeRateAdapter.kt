package com.haymarsan.myanmarcurrencyexchange.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haymarsan.myanmarcurrencyexchange.R
import com.haymarsan.myanmarcurrencyexchange.data.room.CurrencyEntity
import com.haymarsan.myanmarcurrencyexchange.views.holders.CurrencyListViewHolder

class ExchangeRateAdapter(context: Context): BaseRecyclerAdapter<CurrencyListViewHolder, CurrencyEntity>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyListViewHolder {

        val view = mLayoutInflater.inflate(R.layout.view_item_exchange_rate_list, parent, false)
        return CurrencyListViewHolder(view)


    }


}