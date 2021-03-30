package com.example.hw3

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hw3.databinding.CardviewBinding
import com.example.hw3.databinding.ListTileBinding

data class PlaceholderItem(
    val id: String,
    val title: String,
    val subtitle :String?,
    val image : Drawable?
){
    override fun toString(): String = title
}

class ItemAdapter:ListAdapter<PlaceholderItem, ItemAdapter.ViewHolder>(DiffCallback){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CardviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
       val item = currentList[position]
        holder.bind(item)
    }

    inner class ViewHolder (private val binding: CardviewBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: PlaceholderItem){
            binding.tile.binding.leading.setImageDrawable(item.image)
            binding.tile.binding.title.text = item.title
            binding.tile.binding.subtitle.text = item.subtitle
        }
    }

    object DiffCallback : DiffUtil.ItemCallback<PlaceholderItem>(){
        override fun areItemsTheSame(oldItem: PlaceholderItem, newItem: PlaceholderItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: PlaceholderItem,
            newItem: PlaceholderItem
        ): Boolean {
           return oldItem == newItem
        }
    }
}