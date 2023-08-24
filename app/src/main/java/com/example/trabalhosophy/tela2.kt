package com.example.trabalhosophy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
    }

    fun fechaTela(view: View){
        Toast.makeText(this,"Você já está logado.", Toast.LENGTH_LONG).show()

    }

}