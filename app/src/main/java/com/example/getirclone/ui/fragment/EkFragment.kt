package com.example.getirclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirclone.R
import com.example.getirclone.data.entity.Ekurunler
import com.example.getirclone.databinding.FragmentAnasayfaBinding
import com.example.getirclone.ui.adapter.EkurunlerAdapter

class EkFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        binding.rv.layoutManager= StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        val ekListe=ArrayList<Ekurunler>()
        val e1=Ekurunler(1,"ek1","atistirmalik")
        val e2=Ekurunler(2,"ek2","dondurma")
        val e3=Ekurunler(3,"ek3","evbakim")
        val e4=Ekurunler(4,"ek4","evyasam")
        val e5=Ekurunler(5,"ek5","firindan")
        val e6=Ekurunler(6,"ek6","fitform")
        val e7=Ekurunler(7,"ek7","icecek")
        val e8=Ekurunler(8,"ek8","indirimler")
        val e9=Ekurunler(9,"ek9","kahvaltilik")
        val e10=Ekurunler(10,"ek10","kisiselbakim")
        val e11=Ekurunler(11,"ek11","meyvesebze")
        val e12=Ekurunler(12,"ek12","suturunleri")
        val e13=Ekurunler(13,"ek13","teknoloji")
        val e14=Ekurunler(14,"ek14","temelgida")
        val e15=Ekurunler(15,"ek15","yiyecek")
        ekListe.add(e1)
        ekListe.add(e2)
        ekListe.add(e3)
        ekListe.add(e4)
        ekListe.add(e5)
        ekListe.add(e6)
        ekListe.add(e7)
        ekListe.add(e8)
        ekListe.add(e9)
        ekListe.add(e10)
        ekListe.add(e11)
        ekListe.add(e12)
        ekListe.add(e13)
        ekListe.add(e14)
        ekListe.add(e15)

        val ekAdapter= EkurunlerAdapter(requireContext(),ekListe)
        binding.rv.adapter=ekAdapter




        return binding.root
    }

    }
