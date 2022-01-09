package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val person = Person("John",21,"Tester")
        val person1 = Person("dave",30,"Bus Driver")

        run{
            if(person.age> person1.age) person else person1
        }.printPerson()

        // using with we can modify object
        with(person){
            age = 38
            person   // we can return anything what we want
        }.printPerson()


        person.run {
            person1   // we can return anything we want
        }.printPerson()


        person.let {
            it.age = 30
            it
        }.printPerson()


        person1.apply {    // it returns same tyoe
            age = 40
        }.printPerson()


    }
}