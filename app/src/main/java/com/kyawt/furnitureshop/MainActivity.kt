package com.kyawt.furnitureshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.furnitureshop.adapter.CategoryAdapter
import com.kyawt.furnitureshop.adapter.FurnitureAdapter
import com.kyawt.furnitureshop.model.Category
import com.kyawt.furnitureshop.model.Furniture

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryView()
        trendingView()
        bestSellingView()
    }

    fun categoryView(){
        var categoryRecyclerView : RecyclerView = findViewById(R.id.recycler_discover)

        var categoryList = ArrayList<Category>()
        categoryList.add(Category("Chair", 122, R.drawable.chair2))
        categoryList.add(Category("Table", 333,R.drawable.sofa))
        categoryList.add(Category("Sofa", 333,R.drawable.table))

        var categoryAdapter = CategoryAdapter(categoryList)
        categoryRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        categoryRecyclerView.adapter = categoryAdapter
    }

    fun trendingView(){
        var trendingRecyclerView : RecyclerView = findViewById(R.id.recycler_trending)

        var trendingList = ArrayList<Furniture>()
        trendingList.add(Furniture("Ivonne chair, green", 29.00, R.drawable.chair))
        trendingList.add(Furniture("Snakeskin Pattern Buckle", 29.00, R.drawable.chair2))
        trendingList.add(Furniture("Armchair Konna green", 39.00,R.drawable.sofa))

        var trendingAdapter = FurnitureAdapter(trendingList)
        trendingRecyclerView.layoutManager = LinearLayoutManager(this)
        trendingRecyclerView.adapter = trendingAdapter
    }

    fun bestSellingView(){
        var bestSellingRecyclerView : RecyclerView = findViewById(R.id.recycler_best_selling)

        var bestSellingList = ArrayList<Furniture>()
        bestSellingList.add(Furniture("Ruffle Trim Spot Wrap Dress", 29.00, R.drawable.chair))
        bestSellingList.add(Furniture("Leaf Floral Print Random", 29.00, R.drawable.chair2))
        bestSellingList.add(Furniture("Drop Shoulder Go Pattern", 39.00,R.drawable.sofa))

        var bestSellingAdapter = FurnitureAdapter(bestSellingList)
        bestSellingRecyclerView.layoutManager = LinearLayoutManager(this)
        bestSellingRecyclerView.adapter = bestSellingAdapter
    }
}
