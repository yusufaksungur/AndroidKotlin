package com.example.runnabkotlin

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.runnabkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number: Int = 0
    private lateinit var runnable: Runnable
    private var handler: Handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun start(view: View) {
        number = 0 // Sayacı sıfırla
        runnable = object : Runnable {
            override fun run() {
                number += 1
                binding.text1.text = "TIME: $number"
                handler.postDelayed(this, 1000) // 1 saniye sonra tekrar çalıştır
            }
        }
        handler.post(runnable)
        binding.button.isEnabled = false // Bir kere tıklanabilir
    }

    fun stop(view: View) {
        binding.button.isEnabled = true // Butonu tekrar aktif et
        number = 0 // Sayacı sıfırla
        binding.text1.text = "TIME: 0"
        handler.removeCallbacks(runnable) // İş parçacığını durdur
    }
}
