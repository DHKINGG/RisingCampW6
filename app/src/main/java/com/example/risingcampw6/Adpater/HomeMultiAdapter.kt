package com.example.risingcampw6.Adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.risingcampw6.Model.TopInfoModel
import com.example.risingcampw6.databinding.ItemViewTopInfoMultiBinding
import com.example.risingcampw6.databinding.ItemViewhomeSearchMultiBinding

class MultiAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var topInfoDataList = mutableListOf<TopInfoModel>()
    lateinit var adapterContext: Context

    inner class TopInfoHolder(private val binding: ItemViewTopInfoMultiBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MutableList<TopInfoModel>) {
            binding.rvTopInfo.layoutManager =
                LinearLayoutManager(adapterContext, LinearLayoutManager.HORIZONTAL, false)
            val recyclerAdapter = TopImageInfoAdapter()
            recyclerAdapter.list = item
            binding.rvTopInfo.adapter = recyclerAdapter
        }
    }

   
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == 0) {
            return TopInfoHolder(
                ItemViewTopInfoMultiBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
        return TopInfoHolder(
            ItemViewTopInfoMultiBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            if (position == 0) {
                (holder as TopInfoHolder).bind(topInfoDataList)
            }
    }

    override fun getItemCount(): Int {
            return 1
    }

    fun setContext(context: Context) {
        adapterContext = context
    }
}
