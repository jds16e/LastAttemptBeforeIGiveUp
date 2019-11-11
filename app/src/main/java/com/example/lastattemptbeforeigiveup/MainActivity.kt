package com.example.lastattemptbeforeigiveup

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button: Button = findViewById(R.id.ring)
        button.setOnClickListener{
            frodoimage.visibility = View.INVISIBLE
        }
    }
}
