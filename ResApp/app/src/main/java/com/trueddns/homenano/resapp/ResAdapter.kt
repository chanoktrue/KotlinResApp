package com.trueddns.homenano.resapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ResAdapter(val menuList: ArrayList<ResModel>): RecyclerView.Adapter<ResAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val detaiTextView: TextView = itemView.findViewById(R.id.detailTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.sample, parent, false)
        return MyViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.titleTextView.text = menuList[position].resName
        holder.imageView.setImageResource(menuList[position].resImage!!)
        holder.detaiTextView.text = menuList[position].resDetail
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

}