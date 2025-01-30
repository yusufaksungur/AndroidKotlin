package com.example.birdsyakalama

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.birdsyakalama.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var score: Int = 0
    private var runnable = Runnable { }
    private var handler: Handler = Handler(Looper.getMainLooper())
    private var imageArray = ArrayList<ImageView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageArray.add(binding.imageView)
        imageArray.add(binding.imageView2)
        imageArray.add(binding.imageView3)
        imageArray.add(binding.imageView4)
        imageArray.add(binding.imageView5)
        imageArray.add(binding.imageView6)
        imageArray.add(binding.imageView7)
        imageArray.add(binding.imageView8)
        imageArray.add(binding.imageView9)

        hideImages()

        // Geri Sayım Zamanlayıcı
        object : CountDownTimer(15000, 1000) { // 15 saniye toplam süre
            override fun onTick(millisUntilFinished: Long) {
                binding.text1.text = "Time: ${millisUntilFinished / 1000}"
            }

            override fun onFinish() {
                binding.text1.text = "Time: 0"
                handler.removeCallbacks(runnable)
                for (image in imageArray) {
                    image.visibility = View.INVISIBLE
                }

                val alert = AlertDialog.Builder(this@MainActivity)
                alert.setTitle("Game Over")
                alert.setMessage("Restart The Game?")
                alert.setPositiveButton("Yes") { _, _ ->
                    val intent = intent
                    finish()
                    startActivity(intent)
                }
                alert.setNegativeButton("No") { _, _ ->
                    Toast.makeText(this@MainActivity, "Game Over", Toast.LENGTH_SHORT).show()
                }
                alert.show()
            }
        }.start()
    }

    private fun hideImages() {
        runnable = object : Runnable {
            override fun run() {
                for (image in imageArray) {0
                    image.visibility = View.INVISIBLE
                }

                val randomIndex = Random.nextInt(imageArray.size)
                imageArray[randomIndex].visibility = View.VISIBLE
                handler.postDelayed(runnable, 500)
            }
        }
        handler.post(runnable)
    }

    fun increaseScore(view: View) {
        score++
        binding.text2.text = "Score: $score"
    }
}
