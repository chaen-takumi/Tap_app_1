package com.example.tap_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //1)タッチ処理
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val iv: ImageView = findViewById(R.id.iv)

        //2)条件分岐
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> iv.setImageResource(R.drawable.cat02)
            MotionEvent.ACTION_MOVE -> iv.setImageResource(R.drawable.cat03)
            MotionEvent.ACTION_UP -> iv.setImageResource(R.drawable.cat03)

        }

        return super.onTouchEvent(event)
    }

}