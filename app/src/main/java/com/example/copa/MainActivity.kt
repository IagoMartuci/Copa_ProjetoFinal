package com.example.copa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btnEscalacao)

        button.setOnClickListener {
            openDetailActivity()
        }
    }

        private fun openDetailActivity() {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
}
