package com.example.pixaby

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.pixaby.databinding.ItemBinding
import com.example.pixaby.model.ImageModel

class ImageAdapter(private val list : List<ImageModel>)
    : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ImageViewHolder(private val binding : ItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(model : ImageModel){
            binding.pixabyImage.load(model.largeImageURL)
        }
    }
}

