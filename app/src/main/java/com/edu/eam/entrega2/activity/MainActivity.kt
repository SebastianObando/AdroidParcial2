package com.edu.eam.entrega2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.edu.eam.entrega2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun irProgramas(v: View) {
        //val intent = Intent(this, InfoProgramaActivity::class.java)
        //startActivity(intent)
        val intent = Intent(this, RecyclerViewProgramasActivity::class.java)
        startActivity(intent)
    }

}