package com.haymarsan.myanmarcurrencyexchange.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haymarsan.myanmarcurrencyexchange.R
import com.haymarsan.myanmarcurrencyexchange.data.vos.ExchangeRateVO

class CurrencyListAdapter(var currencyList: ArrayList<ExchangeRateVO>) :
    RecyclerView.Adapter<CurrencyListAdapter.CurrencyListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CurrencyListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_item_exchange_rate_list,
                parent,
                false
            )
            )


    override fun getItemCount() = currencyList.size

    override fun onBindViewHolder(holder: CurrencyListViewHolder, position: Int) {
        holder.bindData(currencyList[position])
    }


    inner class CurrencyListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindData(exchangeRateVO: ExchangeRateVO) {

            //TODO

//            itemView.tvBookName.text = bookVO.bookName
//            itemView.tvBookPrice.text = bookVO.bookPrice.toString()

        }


    }


}