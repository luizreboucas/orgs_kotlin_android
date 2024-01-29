package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this,"Bem vindo ao App", Toast.LENGTH_SHORT).show()
    }
}