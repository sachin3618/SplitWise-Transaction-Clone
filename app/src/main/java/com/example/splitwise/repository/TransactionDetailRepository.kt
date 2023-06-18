package com.example.splitwise.repository

import androidx.lifecycle.MutableLiveData
import com.example.splitwise.API.FakeNetworkCall
import com.example.splitwise.model.AccountDetail
import java.util.ArrayList

class TransactionDetailRepository {
    private val mutableLiveData = MutableLiveData<ArrayList<AccountDetail>>()

    //call to internet and  retun  MutableLiveData
    fun getMutableLiveData(): MutableLiveData<ArrayList<AccountDetail>> {
        val apiResponse = FakeNetworkCall().getAPIResponse()
        mutableLiveData.value = apiResponse
        return mutableLiveData
    }

    companion object {

        private val TAG = "TransactionDetailRepository"
    }
}