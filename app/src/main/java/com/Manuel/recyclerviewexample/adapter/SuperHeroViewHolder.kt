package com.manuel.recyclerviewexample.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.manuel.recyclerviewexample.SuperHero
import com.manuel.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view:View):RecyclerView.ViewHolder(view){

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListener:(SuperHero) -> Unit){
        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.tvSuperHero.context).load(superHeroModel.photo).into(binding.tvSuperHero)

        itemView.setOnClickListener {  onClickListener(superHeroModel)}
    }
}