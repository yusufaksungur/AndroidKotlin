package com.example.oopkotlin1

class User {

    //Property
    var name : String? = null
    var age : Int? = null

    //constructor ve init

    constructor(nameInput : String, ageInput: Int){
        this.name = nameInput
        this.age = ageInput
        println("User Created")
    }

    init {
        println("init")
    }


}