package com.example.aplikasiheroml

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_profile)

        setTitle("Developer Aplikasi")

        val buttonGoMenu: Button = findViewById(R.id.btn_back_menu)
        buttonGoMenu.setOnClickListener {
            finish()
        }
    }
}