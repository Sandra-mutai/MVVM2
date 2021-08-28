package com.example.cat2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivitypage: AppCompatActivity() {
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent=Intent(baseContext,MainActivity::class.java)
        castView()
        onClick()
        startActivity(intent)


    }
    fun castView(){
        btn1=findViewById(R.id.btnlast)
    }
    fun onClick(){
        btn1.setOnClickListener {
            val intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}