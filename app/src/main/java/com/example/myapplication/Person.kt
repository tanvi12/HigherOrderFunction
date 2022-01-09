package com.example.myapplication

data class Person(var name: String, var age: Int, var job: String) {
    fun printPerson() = println(this.toString())
}