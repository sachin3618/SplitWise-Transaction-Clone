package com.example.splitwise.viewmodel

import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.splitwise.model.AccountDetail
import com.example.splitwise.repository.TransactionDetailRepository
import java.util.ArrayList

class MainActivityViewModel : ViewModel() {
    private val repository: TransactionDetailRepository = TransactionDetailRepository()


    val transactionRequest: LiveData<ArrayList<AccountDetail>>
        get() = repository.getMutableLiveData()

}