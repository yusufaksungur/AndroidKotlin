package com.example.intentkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentkotlin.databinding.ActivityMainBinding
import com.example.intentkotlin.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       val intentfromMain = intent //verileri cekme fonksiyonu  getIntent()
        val name = intentfromMain.getStringExtra("name") //anahtar istiyor-main ile aynı olmalı
        val myIntager = intentfromMain.getIntExtra("myintager", -1)

        binding.nametext.text = "Name: ${name}"
        println(myIntager)



    }







    fun nextTWO(view: View){
        val intent = Intent(this@NextActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }




}