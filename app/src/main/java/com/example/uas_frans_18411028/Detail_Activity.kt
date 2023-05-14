package com.example.uas_frans_18411028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager

class Detail_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val Image = intent.getParcelableExtra<DataModel>(MainActivity.INTENT_PARCELABLE)
        val imgSrc = findViewById<ImageView>(R.id._ImageDetail)
        val imgTitle = findViewById<TextView>(R.id._ImageTitle)
        val imgDesc = findViewById<TextView>(R.id._ImageDesc)

        imgSrc.setImageResource(Image!!.iconsImage)
        imgTitle.text = Image.titleImage
        imgDesc.text = Image.DescImage
    }
}