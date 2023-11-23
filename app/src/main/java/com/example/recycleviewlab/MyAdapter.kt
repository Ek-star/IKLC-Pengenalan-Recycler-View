package com.example.recycleviewlab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val data: ArrayList<SocialMedia>): RecyclerView.Adapter<ViewHolder>() {
    // adapter untuk RecyclerView Anda. Ini bertanggung jawab untuk membuat ViewHolder dan menghubungkannya dengan data.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // membuat dan mengembalikan instance ViewHolder.
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater,parent)
    }

    override fun getItemCount(): Int {
        // memberikan jumlah item dalam data.
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // mengikat data pada posisi tertentu ke ViewHolder.
        holder.bind(data[position])
    }
}