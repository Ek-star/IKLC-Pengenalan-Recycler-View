package com.example.recycleviewlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewlab.SocialMedia

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<SocialMedia>()
        data.add(SocialMedia(R.drawable.instagram , "Facebook" , "Facebook Icon"))
        data.add(SocialMedia(R.drawable.twitter , "X" , "X Icon"))
        data.add(SocialMedia(R.drawable.whatsapp, "Whatsapp" , "Whatsapp Icon"))
        data.add(SocialMedia(R.drawable.youtube , "Youtube" , "Youtube Icon"))

        adapter = MyAdapter(data)
    }

}