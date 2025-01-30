package com.example.oopkotlin1

class Dog : Animal() {

    fun test(){
        super.sing()
    }

    override fun sing(){
        println("dog class")

    }



}