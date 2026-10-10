package com.example.navigationdrawerapp2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationdrawerapp2.databinding.ActivitySubwayBinding

class SubwayActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubwayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubwayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}