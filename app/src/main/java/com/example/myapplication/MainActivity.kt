package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    private lateinit var imageView: ImageView
    private lateinit var button: Button

    private val coinFlip : IntArray = intArrayOf(
        R.drawable.heads,
        R.drawable.tails,
        )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val Random = Random
            imageView.setImageResource(coinFlip[Random.nextInt(coinFlip.size)])
        }
    }
}