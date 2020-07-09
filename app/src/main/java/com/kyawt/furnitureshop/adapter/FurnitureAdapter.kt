package com.kyawt.furnitureshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.furnitureshop.R
import com.kyawt.furnitureshop.model.Furniture
import kotlinx.android.synthetic.main.item_trending.view.*

class FunitureViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var name = itemView.findViewById<TextView>(R.id.name_trending)
    var price = itemView.findViewById<TextView>(R.id.price_trending)
    var image = itemView.findViewById<ImageView>(R.id.img_trending)
}

class FurnitureAdapter(var funitureArrayList: ArrayList<Furniture>) :
    RecyclerView.Adapter<FunitureViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FunitureViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_trending, parent, false)
        return FunitureViewHolder(view)
    }

    override fun getItemCount(): Int {
        return funitureArrayList.size
    }

    override fun onBindViewHolder(holder: FunitureViewHolder, position: Int) {
        holder.name.text = funitureArrayList[position].name
        holder.price.text = funitureArrayList[position].price.toString()
        holder.image.setImageResource(funitureArrayList[position].image)
    }

}