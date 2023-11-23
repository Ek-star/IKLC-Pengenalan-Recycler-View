package com.example.recycleviewlab

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_template, parent, false)) {

        private var imgView: ImageView? = null
        private var txtTitle: TextView? = null
        private var txtSubTitle: TextView? = null

        init {
            imgView = itemView.findViewById(R.id.img_view)
            txtTitle = itemView.findViewById(R.id.txt_title)
            txtSubTitle = itemView.findViewById(R.id.txt_sub_title)
        }

        fun bind(data: SocialMedia) {
            imgView?.setImageResource(data.imgView)
            txtTitle?.text = data.txtTitle
            txtSubTitle?.text = data.txtSubTitle
        }
}

// ViewHolder adalah kelas yang digunakan untuk menyimpan referensi ke elemen-elemen tampilan di dalam setiap item RecyclerView.
// init block adalah bagian dari kelas yang dijalankan saat instance ViewHolder dibuat.
// bind adalah fungsi untuk mengisi tampilan ViewHolder dengan data dari objek SocialMedia.