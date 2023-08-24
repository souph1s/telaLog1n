package com.example.trabalhosophy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun proximaTela(view: View?){
        var intent = Intent(this, tela2::class.java)
        startActivity(intent)
    }

    override fun onRestart() {
        proximaTela(null)
        super.onRestart()
    }
}