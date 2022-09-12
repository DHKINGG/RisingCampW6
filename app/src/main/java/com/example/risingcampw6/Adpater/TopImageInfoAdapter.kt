package com.example.risingcampw6.Adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.risingcampw6.Model.TopInfoModel
import com.example.risingcampw6.R
import com.example.risingcampw6.databinding.ItemViewTopInfoBinding

class TopImageInfoAdapter : RecyclerView.Adapter<TopImageInfoAdapter.Holder>() {

    var list = mutableListOf<TopInfoModel>()
    lateinit var adapterContext : Context

    inner class Holder(private val binding: ItemViewTopInfoBinding) :
        RecyclerView.ViewHolder(binding.root){
            fun bind(item: TopInfoModel){

                binding.tvSubTitle.text = item.title
                binding.tvSubTitle.text = item.subTitle
                binding.tvTopBackground.setImageResource(R.drawable.top_image_source_1)

            }
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopImageInfoAdapter.Holder {
        return Holder(
            ItemViewTopInfoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder:Holder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setContext(context: Context) {
        adapterContext = context
    }
}