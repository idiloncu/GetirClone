package com.example.getirclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirclone.data.entity.Ekurunler
import com.example.getirclone.databinding.CardTasarimBinding

class EkurunlerAdapter(var mContext: Context, var ekListe: List<Ekurunler>)
    :RecyclerView.Adapter<EkurunlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)

    }

    override fun onBindViewHolder(holder: EkurunlerAdapter.CardTasarimTutucu, position: Int) {
        val ekreklam=ekListe.get(position)
        val t =holder.tasarim

        t.imageView.setImageResource(
            mContext.resources.getIdentifier(ekreklam.resimmini,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return ekListe.size
    }

}
