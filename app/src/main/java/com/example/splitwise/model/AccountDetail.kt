package com.example.splitwise.model


// Data Class for filling monthly summary of transactions statement
data class AccountDetail(
    var month: String = "",
    var year: String = "",
    var accountName: String = "",
    var accountDetail: String = "",
    var accountAction: String = "",
    var accountBalance: String = "",
    var resValue: Int
)
