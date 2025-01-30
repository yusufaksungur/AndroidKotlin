package com.example.alertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /* 1) Toast mesajı 2) AlertDialog 3)Snackbar

        Context
        Activity Context -> this
        Application Context -> applicationContext

        Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show()
        Toast.makeText(applicationContext,"Welcome",Toast.LENGTH_LONG).show()

        -lambda
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            println("button clicked")
        }
        */



    }
        //Alert Dialog
    fun save(view: View){
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Title")
        alert.setMessage("Message")
        alert.setPositiveButton("Yes", object : DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(this@MainActivity, "YES1", Toast.LENGTH_LONG).show()

                            }

        })
        alert.setNegativeButton("No"){
            p0, p1 -> Toast.makeText(this@MainActivity,"No Saved",Toast.LENGTH_LONG).show()
        }


        alert.show()

    }
}