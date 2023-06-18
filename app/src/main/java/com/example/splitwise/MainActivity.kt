package com.example.splitwise

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.splitwise.CustomAdapters.TransactionDetailsAdapter
import com.example.splitwise.databinding.ActivityMainBinding
import com.example.splitwise.model.AccountDetail
import com.example.splitwise.viewmodel.MainActivityViewModel
import kotlin.collections.ArrayList

@Suppress("UNCHECKED_CAST")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainActivityViewModel
    private lateinit var transactionDetailAdapter: TransactionDetailsAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // init viewModel
        mainViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        getAllTransaction()
        transactionDetailAdapter = TransactionDetailsAdapter()
        val recyclerView = binding.includedLayout.rvTransactions
        recyclerView.setHasFixedSize(true)
        recyclerView.setAdapter(transactionDetailAdapter)



        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }


    }



    private fun getAllTransaction() {
        ///get the list of dev from api response
        mainViewModel.transactionRequest.observe(this,
            Observer<List<Any>> { transactionDetail ->
                ///if any thing chnage the update the UI
                transactionDetailAdapter.setDeveloperList(transactionDetail as ArrayList<AccountDetail>)
            })
    }
}