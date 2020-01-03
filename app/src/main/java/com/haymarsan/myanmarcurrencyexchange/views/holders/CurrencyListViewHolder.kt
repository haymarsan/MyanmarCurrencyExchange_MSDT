package com.haymarsan.myanmarcurrencyexchange.views.holders

import android.view.View
import com.haymarsan.myanmarcurrencyexchange.data.room.CurrencyEntity
import kotlinx.android.synthetic.main.view_item_exchange_rate_list.view.*

class CurrencyListViewHolder(itemView: View): BaseViewHolder<CurrencyEntity>(itemView) {

    override fun setData(data: CurrencyEntity) {
        itemView.tvCurrencyCode.text = data.currency_code
        itemView.tvSellRate.text = data.mmk
    }

    override fun onClick(v: View?) {

    }


}