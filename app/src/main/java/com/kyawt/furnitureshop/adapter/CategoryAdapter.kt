package com.kyawt.furnitureshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.furnitureshop.R
import com.kyawt.furnitureshop.model.Category

class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var categoryName = itemView.findViewById<TextView>(R.id.txt_discover_name)
    var categoryItemCount = itemView.findViewById<TextView>(R.id.count_discover)
    var categoryImage = itemView.findViewById<ImageView>(R.id.img_discover)
}

class CategoryAdapter(var categoryList: ArrayList<Category>) :RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_discover,parent,false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.categoryName.text = categoryList[position].categoryName
        holder.categoryItemCount.text = categoryList[position].categoryItemCount.toString()
        holder.categoryImage.setImageResource(categoryList[position].categoryImage)
    }
}