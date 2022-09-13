package com.fpp.testlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var next = findViewById<Button>(R.id.przycisk_Next)
        var prev = findViewById<Button>(R.id.przycisk_Prev)
        var imgview = findViewById<ImageView>(R.id.imgView)

        var zdj = 1

        imgview.setImageResource(R.drawable.ai)

        next.setOnClickListener {
            if (zdj == 1) {
                imgview.setImageResource(R.drawable.ai)
                zdj++
            }
            else if (zdj == 2)
            {
                imgview.setImageResource(R.drawable.hito)
                zdj++
            }
            else if (zdj == 3)
            {
                imgview.setImageResource(R.drawable.sad)
                zdj++
            }
            else if (zdj == 4)
            {
                imgview.setImageResource(R.drawable.truth)
                zdj = 1
            }
        }

        prev.setOnClickListener {
            if (zdj == 4) {
                imgview.setImageResource(R.drawable.truth)
                zdj--
            }
            else if (zdj == 3)
            {
                imgview.setImageResource(R.drawable.sad)
                zdj--
            }
            else if (zdj == 2)
            {
                imgview.setImageResource(R.drawable.hito)
                zdj--
            }
            else if (zdj == 1)
            {
                imgview.setImageResource(R.drawable.ai)
                zdj = 4
            }
        }
    }
}