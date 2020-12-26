package com.example.healthy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.healthy.R

class HomeMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_menu)
    }

    fun onClick(view: View) {
        val intent = Intent()
        when (view.id) {
            R.id.home_btn1 -> intent.setClass(this@HomeMenuActivity, InfoListActivity::class.java)
            //R.id.home_btn2 -> intent.setClass(this@HomeMenuActivity, FoodGridActivity::class.java)
            //R.id.home_btn3 -> intent.setClass(this@HomeMenuActivity, AboutActivity::class.java)
        }
        startActivity(intent)
    }
}