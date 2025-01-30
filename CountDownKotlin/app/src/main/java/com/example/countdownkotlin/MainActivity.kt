package com.example.countdownkotlin

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countdownkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun nahBtn(view: View){
        object : CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
                binding.textwiw.text = "Left ${p0/1000}"

            }

            override fun onFinish(){
                binding.textwiw.text = "Time: 0"
                binding.imageView.visibility = View.VISIBLE
            }

        }.start()

    }
}



//Abstract - Interface - Inheritance