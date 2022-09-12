package com.example.risingcampw6.Fragment

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.risingcampw6.Adpater.MultiAdapter
import com.example.risingcampw6.Model.TopInfoModel
import com.example.risingcampw6.R
import com.example.risingcampw6.databinding.FragmentHomeBinding

class HomeFragment() : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private var topInfoData = mutableListOf<TopInfoModel>()

    override fun initView() {
        setTopInfoData()

        binding.rvMain.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        val adapter = MultiAdapter()
        adapter.topInfoDataList = topInfoData
        adapter.setContext(requireContext())
        binding.rvMain.adapter = adapter
    }





    fun setTopInfoData() {
        topInfoData.add(
            TopInfoModel(
                "코로나검사 가능병원은?",
                R.drawable.top_image_source_1,
                "가까운 신속항원,PCR검사 병원찾기",
                R.drawable.yadoran
            )
        )
        topInfoData.add(
            TopInfoModel(
                "코로나검사 가능병원은?",
                R.drawable.top_image_source_1,
                "가까운 신속항원,PCR검사 병원찾기",
                R.drawable.yadoran
            )
        )
        topInfoData.add(
            TopInfoModel(
                "코로나검사 가능병원은?",
                R.drawable.top_image_source_1,
                "가까운 신속항원,PCR검사 병원찾기",
                R.drawable.yadoran
            )
        )
        topInfoData.add(
            TopInfoModel(
                "코로나검사 가능병원은?",
                R.drawable.top_image_source_1,
                "가까운 신속항원,PCR검사 병원찾기",
                R.drawable.yadoran
            )
        )
        topInfoData.add(
            TopInfoModel(
                "코로나검사 가능병원은?",
                R.drawable.top_image_source_1,
                "가까운 신속항원,PCR검사 병원찾기",
                R.drawable.yadoran
            )
        )
    }


}