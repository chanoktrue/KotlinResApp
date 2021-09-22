package com.trueddns.homenano.resapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<ResModel>()
        var resAdapter: ResAdapter? = null

        list.add(ResModel(R.drawable.burger1, "Macdonald Burger1","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"))
        list.add(ResModel(R.drawable.burger2, "Macdonald Burger2", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"))
        list.add(ResModel(R.drawable.burger3, "Macdonald Burger3","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"))
        list.add(ResModel(R.drawable.burger4, "Macdonald Burger4","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"))

        resAdapter = ResAdapter(list)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = resAdapter

    }
}