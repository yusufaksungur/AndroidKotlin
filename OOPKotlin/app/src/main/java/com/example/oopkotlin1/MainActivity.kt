package com.example.oopkotlin1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //constructor
        var myUser = User("James", ageInput = 50)
            myUser.name = "lars"
            myUser.age = 60
        println(myUser.name)
        println(myUser.age.toString())

        //encapsulation
        var james = Musician("james", "gitar", 15)
        println(james.age.toString())
        println(james.returnBandName("yusuf"))
        println(james.returnBandName("ss"))

        //inheritance
        var lars = SuperMusician("lars", "drums", 15)
        println(lars.name)
        println(lars.returnBandName("yusuf"))
        lars.sing()

        //polymorphism

        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(5,3))
        println(mathematics.sum(6,8,9))

        //dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        //abstract & interface
        //var

        var myPiano = Piano()
        myPiano.brand = "yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expression

        fun printstring(myString: String){
            println(myString)
        }
        printstring("TEXT")

        val testString = {myString : String -> println(myString) }

        testString("my lambda")

        val multiply = {a : Int, b : Int -> println(a * b)}

        multiply(5,6)

        val multiply2 : (Int, Int) -> Int = {a,b -> a * b}
        multiply2(8,5)
        println(multiply2)

    }
}