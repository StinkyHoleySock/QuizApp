package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener(){
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Введите имя", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }

        iv_info.setOnClickListener(){
            val intent = Intent(this, InformationMenuActivity::class.java)
            startActivity(intent)
        }

        iv_map.setOnClickListener(){
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}