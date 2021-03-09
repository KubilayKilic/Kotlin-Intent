package com.kaan.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate called")
    }

    override fun onResume() {
        super.onResume()

        println("onResume called")
    }

    override fun onPause() {
        super.onPause()

        println("onPause called")
    }

    override fun onStop() {
        super.onStop()

        println("onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()

        println("onDestroy called")
    }

    fun next(view : View) {

        val intent = Intent(applicationContext, NextActivity::class.java)
        //username ve name'i next activity'ye yollama
        intent.putExtra("username", usernameText.text.toString())
        intent.putExtra("name", nameText.text.toString())
        startActivity(intent)
        finish()
    }
}