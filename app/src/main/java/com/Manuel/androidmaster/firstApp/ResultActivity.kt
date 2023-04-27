package com.Manuel.androidmaster.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.Manuel.androidmaster.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        //como puede ser null le decimos que pase el string o un string vacio
        val name:String = intent.extras?.getString("ExtraName").orEmpty()
                                    // interrogacion de nullable
        tvResult.text = "Hola $name"
    }
}