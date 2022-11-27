package com.ahmad.listapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.ahmad.listapp.R.id.*
import com.ahmad.listapp.model.DaftarKuliner

class DetailKulinerActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner)

        val name = findViewById<TextView>(R.id.tv_item_name)
        val desc = findViewById<TextView>(R.id.tv_item_description)
        val image = findViewById<ImageView>(R.id.img_item_photo)



        val intent = intent
        val imagaIntent = intent.getIntExtra("image",0)
        val nameIntent = intent.getStringExtra("name")
        val descIntent = intent.getStringExtra("desc")


        image.setImageResource(imagaIntent)
        name.text = nameIntent
        desc.text = descIntent


    }
}