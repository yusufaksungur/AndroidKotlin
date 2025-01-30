package com.atilsamancioglu.kotlinlandmarkbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.landmarkbook.Landmark
import com.example.landmarkbook.R
import com.example.landmarkbook.databinding.ActivityMainBinding

object MySingleton {
    var selectedLandmark : Landmark? = null
}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(this.layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //data
        val ayairini = Landmark("Aya irini Kilisesi", "Istanbul", R.drawable.ayairini)

        val kapalicarsi = Landmark("Kapalı Çarşı", "Istanbul", R.drawable.kapalicarsi)

        val kariyecami = Landmark("Kariye Camii", "Istanbul", R.drawable.kariyecami)

        val topkapi = Landmark("Topkapı Sarayı", "Istanbul", R.drawable.topkapi)

        landmarkList.add(ayairini)
        landmarkList.add(kapalicarsi)
        landmarkList.add(kariyecami)
        landmarkList.add(topkapi)




    }
}