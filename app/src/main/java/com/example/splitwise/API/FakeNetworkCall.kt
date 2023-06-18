package com.example.splitwise.API

import com.example.splitwise.R
import com.example.splitwise.model.AccountDetail
import java.util.ArrayList

class FakeNetworkCall {

    fun getAPIResponse() : ArrayList<AccountDetail>{
        return arrayListOf(
            AccountDetail(
                "Mar",
                "18",
                "Elle's bakery",
                "Earl E. paid $102.72",
                "you borrowed",
                "$34.61",
                R.drawable.dinner_table
            ),

            AccountDetail(
                "Mar",
                "19",
                "Amy's shop",
                "Amy A. paid $23.72",
                "you borrowed",
                "$23.61",
                R.drawable.petrol_pump
            ),

            AccountDetail(
                "Mar",
                "21",
                "Jason's shop",
                "Jason M. paid $13.72",
                "you borrowed",
                "$48.61",
                R.drawable.validating_ticket
            )
        )
    }
}