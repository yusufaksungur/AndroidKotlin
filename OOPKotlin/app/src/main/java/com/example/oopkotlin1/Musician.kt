package com.example.oopkotlin1
//open dersek inherit kalıtım kullanılabilir
open class Musician(name: String, instrument: String, age: Int) {
    var name : String? = name
        private set

    private var instrument : String? = instrument

    var age : Int? = age
        get
        private set

    private val bandName : String = "Metallica"

    fun returnBandName(password : String) : String {
        if(password == "yusuf"){
            return bandName
        } else{
            return "!!!!!"
        }
    }

}