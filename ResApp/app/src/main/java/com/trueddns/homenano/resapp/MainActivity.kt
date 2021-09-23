package com.trueddns.homenano.resapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

// https://youtu.be/g4nqmdMTqTg

class MainActivity : AppCompatActivity() {

    val list = ArrayList<ResModel>()

    val addDataButton: Button by lazy {
        findViewById(R.id.addDataButton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add(ResModel(R.drawable.burger1, "Macdonald Burger1","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"))
        list.add(ResModel(R.drawable.burger2, "Macdonald Burger2", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"))

        val resAdapter = ResAdapter(list)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = resAdapter

        addDataButton.setOnClickListener {
            list.add(ResModel(R.drawable.burger3, "Macdonald Burger3","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"))
            list.add(ResModel(R.drawable.burger4, "Macdonald Burger4","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"))
            resAdapter.notifyDataSetChanged()
            countBurger()
        }

        // set title button
        countBurger()

    }

    fun countBurger() {
        val burgers = list.size
        addDataButton.text = "Add Burger (มีจำนวน $burgers ชิ้น)"
    }
}