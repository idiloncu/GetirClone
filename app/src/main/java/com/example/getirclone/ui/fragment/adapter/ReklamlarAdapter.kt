package com.example.getirclone.ui.fragment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.getirclone.data.entity.Reklamlar
import com.example.getirclone.databinding.CardTasarimBinding

class ReklamlarAdapter(var mContext: Context,var reklamListesi: List<Reklamlar>)
    :RecyclerView.Adapter<ReklamlarAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root){
        var cardViewAd : CardView
        var imageViewAdImage : ImageView
        init {
            cardViewAd=tasarim.cardViewKategori
            imageViewAdImage=tasarim.imageViewCategoriImage

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(tasarim)

    }
    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val reklam=reklamListesi.get(position)
        val t =holder.tasarim

        t.imageViewCategoriImage.setImageResource(
            mContext.resources.getIdentifier(reklam.resim,"drawable",mContext.packageName))



    }
    override fun getItemCount(): Int {
        return reklamListesi.size

    }

}