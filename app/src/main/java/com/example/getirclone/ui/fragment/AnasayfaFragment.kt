package com.example.getirclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirclone.R
import com.example.getirclone.data.entity.Ekurunler
import com.example.getirclone.data.entity.Reklamlar
import com.example.getirclone.databinding.FragmentAnasayfaBinding
import com.example.getirclone.ui.adapter.EkurunlerAdapter
import com.example.getirclone.ui.adapter.ReklamlarAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater,container,false)
        binding.textViewAnabaslik.text="getir"

        binding.rv.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val reklamListesi=ArrayList<Reklamlar>()
        val r1 = Reklamlar(1,"Reklam1","reklam1")
        val r2 = Reklamlar(2,"Reklam2","reklam2")
        val r3 = Reklamlar(3,"Reklam3","reklam3")
        val r4 = Reklamlar(4,"Reklam4","reklam4")
        val r5 = Reklamlar(5,"Reklam5","reklam5")
        val r6 = Reklamlar(6,"Reklam6","reklam6")
        val r7 = Reklamlar(7,"Reklam7","reklam7")
        val r8 = Reklamlar(8,"Reklam8","reklam8")
        val r9 = Reklamlar(9,"Reklam9","reklam9")
        reklamListesi.add(r1)
        reklamListesi.add(r2)
        reklamListesi.add(r3)
        reklamListesi.add(r4)
        reklamListesi.add(r5)
        reklamListesi.add(r6)
        reklamListesi.add(r7)
        reklamListesi.add(r8)
        reklamListesi.add(r9)

        val reklamlarAdapter=ReklamlarAdapter(requireContext(),reklamListesi)
        binding.rv.adapter=reklamlarAdapter

     /*   binding.rv.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
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

        val ekAdapter=EkurunlerAdapter(requireContext(),ekListe)
        binding.rv.adapter=ekAdapter
*/



        return binding.root
    }


}