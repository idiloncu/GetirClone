package com.example.getirclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirclone.data.entity.Ekurunler
import com.example.getirclone.data.entity.Reklamlar
import com.example.getirclone.databinding.FragmentAnasayfaBinding
import com.example.getirclone.ui.fragment.adapter.EkurunlerAdapter
import com.example.getirclone.ui.fragment.adapter.ReklamlarAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var reklamListesi:ArrayList<Reklamlar>
    private lateinit var adapter: ReklamlarAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.rv.layoutManager=StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val categoriesList = ArrayList<Ekurunler>()
        val categoryNameList = arrayOf(
            "Yeni Ürünler",
            "İndirimler",
            "Su & İçecek",
            "Meyve & Se",
            "Fırından",
            "Temel Gıda",
            "Atıştırmalık",
            "Dondurma",
            "Süt Ürünleri",
            "Kahvaltılık",
            "Yiyecek",
            "Fit & Form",
            "Kişisel Bakım",
            "Ev Bakım",
            "Ev & Yaşam",
            "Teknoloji"
        )
        val categoryImageList = arrayOf(
            "yeniurunler",
            "indirimler",
            "icecek",
            "meyvesebze",
            "firindan",
            "temelgida",
            "atistirmalik",
            "dondurma",
            "suturunleri",
            "kahvaltilik",
            "yiyecek",
            "fitform",
            "kisiselbakim",
            "evbakim",
            "evyasam",
            "teknoloji"
        )

        for (i in categoryNameList.indices) {
            categoriesList.add(Ekurunler(categoryNameList[i], categoryImageList[i]))
        }


        val categoriesAdapter = EkurunlerAdapter(requireContext(), categoriesList)
        binding.rv.adapter = categoriesAdapter


        val adsLayoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv2.layoutManager = adsLayoutManager


        val pagerSnapHelper = PagerSnapHelper()
        pagerSnapHelper.attachToRecyclerView(binding.rv2)


        val adList = ArrayList<Reklamlar>()
        val adImageList = arrayOf(
            "reklam1",
            "reklam2",
            "reklam3",
            "reklam4",
            "reklam5",
            "reklam6",
            "reklam7",
            "reklam8",
            "reklam9"
        )

        for (i in adImageList.indices) {
            adList.add(Reklamlar(adImageList[i]))
        }

        val adAdapter = ReklamlarAdapter(requireContext(), adList)
        binding.rv2.adapter = adAdapter

        return binding.root
    }


}