package com.example.splitwise.CustomAdapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.splitwise.R
import com.example.splitwise.databinding.LayoutAccountDetailsBinding
import com.example.splitwise.model.AccountDetail

// RecyclerView Adapter for showing list of transactions for a month.

class TransactionDetailsAdapter :
    RecyclerView.Adapter<TransactionDetailsAdapter.TransactionViewHolder>() {

    private var TransactionDetailModel: ArrayList<AccountDetail>? = null

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): TransactionViewHolder {

        val transactionDetailListItemBinding = DataBindingUtil.inflate<LayoutAccountDetailsBinding>(
            LayoutInflater.from(viewGroup.context),
            R.layout.layout_account_details, viewGroup, false
        )

        return TransactionViewHolder(transactionDetailListItemBinding)
    }

    override fun onBindViewHolder(mDeveloperViewHolder: TransactionViewHolder, i: Int) {
        val currentStudent = TransactionDetailModel!![i]

        mDeveloperViewHolder.tranactionDetailListItemBinding.accountDetail = currentStudent
        mDeveloperViewHolder.tranactionDetailListItemBinding.ivStoreType.setImageResource(currentStudent.resValue)


    }

    override fun getItemCount(): Int {
        return if (TransactionDetailModel != null) {
            TransactionDetailModel!!.size
        } else {
            0
        }
    }

    fun setDeveloperList(transactionDetailModel: ArrayList<AccountDetail>) {
        this.TransactionDetailModel = transactionDetailModel
        notifyDataSetChanged()
    }

    inner class TransactionViewHolder(var tranactionDetailListItemBinding: LayoutAccountDetailsBinding) :
        RecyclerView.ViewHolder(tranactionDetailListItemBinding.root)
}