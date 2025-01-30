package com.example.oopkotlin1

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {

    fun sing(){
        println("nothing else matters")
    }
}