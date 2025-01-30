package com.example.landmarkbook

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook.databinding.ActivityMainBinding

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
        val ayairini = Landmark("Aya irini Kilisesi","Istanbul",R.drawable.ayairini)

        val kapalicarsi = Landmark("Kapalı Çarşı", "Istanbul",R.drawable.kapalicarsi)

        val kariyecami = Landmark("Kariye Camii", "Istanbul", R.drawable.kariyecami)

        val topkapi = Landmark("Topkapı Sarayı", "Istanbul", R.drawable.topkapi)

        landmarkList.add(ayairini)
        landmarkList.add(kapalicarsi)
        landmarkList.add(kariyecami)
        landmarkList.add(topkapi)


        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })

        binding.listview.adapter = adapter



    }

}


/*RecyclerView
binding.recyclerView.layoutManager = LinearLayoutManager(this)
val adapter = LandmarkAdapter(landmarkList)
binding.recyclerView.adapter = adapter
/*
//Adapter: Layout & Data

val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })

binding.listView.adapter = adapter

binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
    val intent = Intent(applicationContext,DetailsActivity::class.java)
    intent.putExtra("landmark",landmarkList[position])
    //MySingleton.selectedLandmark = landmarkList[position]
    startActivity(intent)
}

 */