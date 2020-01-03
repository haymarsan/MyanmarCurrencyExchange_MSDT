package com.haymarsan.myanmarcurrencyexchange.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.haymarsan.myanmarcurrencyexchange.R
import com.haymarsan.myanmarcurrencyexchange.adapter.ExchangeRateAdapter
import com.haymarsan.myanmarcurrencyexchange.data.room.CurrencyEntity
import com.haymarsan.myanmarcurrencyexchange.data.vos.ExchangeRateVO
import com.hms.currencyexchange.viewmodel.ExchangeRateViewModel
import com.hms.currencyexchange.viewmodel.ExchangeRateViewModelImpl
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    lateinit var mViewModel: ExchangeRateViewModel
    lateinit var mAdapter: ExchangeRateAdapter


     override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        mViewModel = ViewModelProviders.of(this).get(ExchangeRateViewModelImpl::class.java)

        mAdapter = ExchangeRateAdapter(context!!)

        view.recyclerExchange.layoutManager = LinearLayoutManager(context)
        view.recyclerExchange.adapter = mAdapter

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel.getAllCurrency().observe(this, Observer {

            var curList = it as ArrayList<CurrencyEntity>
            curList.add(CurrencyEntity(0, "", ""))
            mAdapter.setNewData(curList)
        })

    }
}