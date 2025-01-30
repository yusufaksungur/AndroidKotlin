package com.example.intentkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(this.layoutInflater)
        val view = binding.root
        setContentView(view)



        println("onCreate executed")



    }

    override fun onStart() {
        super.onStart()
        println("OnStart executed")
        binding.edt1.setText("") //edittext de var olanı siler onCrate da yapamazsın
    }

    override fun onResume() {
        super.onResume()
        println("onResume executed")
    }

    override fun onPause() {
        super.onPause()
        println("onPause executed")
    }

    override fun onStop() {
        super.onStop()
        println("onStop executed")
    }



    fun next(view: View){
        val intent = Intent(this@MainActivity, NextActivity::class.java )

        intent.putExtra("name", binding.edt1.text.toString()) //veri yollama 2. ekrana
       // intent.putExtra("username")

        startActivity(intent)
        finish() //aktivieyi bitirir

    }
}