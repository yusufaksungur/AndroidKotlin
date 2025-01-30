package com.example.kotlin2

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin2.databinding.ActivityMainBinding
import java.net.BindException

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedprf: SharedPreferences // Use class-level sharedprf

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater) // XML layout inflater
        val view = binding.root
        setContentView(view)

        sharedprf = this.getSharedPreferences("com.example.kotlin2", Context.MODE_PRIVATE) // Assign it to class-level variable

        val userAgePref = sharedprf.getInt("age", -1) // Default value is -1 if not found
        if (userAgePref == -1) {
            binding.textView.text = "Your age: "
        } else {
            binding.textView.text = "Your age: $userAgePref"
        }
    }

    fun save(view: View) {
        val myAge = binding.edtx.text.toString().toIntOrNull() // Convert input to int
        if (myAge != null) {
            binding.textView.text = "Your age: $myAge"
            sharedprf.edit().putInt("age", myAge).apply() // Save age to SharedPreferences
        }

        Toast.makeText(this,"Save ok", Toast.LENGTH_SHORT).show()
    }

    fun delete(view: View){

        val userAgePref = sharedprf.getInt("age", -1) // Default value is -1 if not found
        if (userAgePref != -1){
            sharedprf.edit().remove("age").apply()
            binding.textView.text = "Your age:"


        }

    }
}




//sharedpreferences - xml - key-value
//sharedprf.edit() veri yazma, gücelleme,
//sharedprf.getInt() yazılımış veriyi almak istiyorsak, anahtar değer verilir
//sharedprf.edit().putInt() anahtar değer verme