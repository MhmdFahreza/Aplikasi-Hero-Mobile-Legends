package com.example.aplikasiheroml

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HeroDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hero_detail)

        setTitle("Detail Hero")

        val tvHeroName: TextView = findViewById(R.id.tv_hero_name)
        val tvHeroDescription: TextView = findViewById(R.id.tv_hero_description)
        val imgHeroPhoto: ImageView = findViewById(R.id.img_hero_photo)

        val heroName = intent.getStringExtra(EXTRA_NAME)
        val heroDescription = intent.getStringExtra(EXTRA_DESCRIPTION)
        val heroPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvHeroName.text = heroName
        tvHeroDescription.text = heroDescription
        imgHeroPhoto.setImageResource(heroPhoto)
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_PHOTO = "extra_photo"
    }
}