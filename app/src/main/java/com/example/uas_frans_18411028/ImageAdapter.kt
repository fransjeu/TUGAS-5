package com.example.uas_frans_18411028


import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class ImageAdapter (private val context : Context,
                    private val images : List <DataModel>,
                    val listener : (DataModel) ->Unit
) : RecyclerView.Adapter<ImageAdapter.ItemHolder>() {

        class ItemHolder (itemView : View) : RecyclerView.ViewHolder (itemView){
              val iconsImage = itemView.findViewById<ImageView>(R.id.icons_image)
              var titleImage = itemView.findViewById<TextView>(R.id.title_image)
              fun bindView(image: DataModel, listener : (DataModel) ->Unit) {
                  iconsImage.setImageResource(image.iconsImage)
                  titleImage.text = image.titleImage
                  itemView.setOnClickListener { listener(image) }
              }
          }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder
    = ItemHolder(LayoutInflater.from(context).inflate(R.layout.grid_layout_list_item,parent, false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bindView(images[position], listener)
    }
}
