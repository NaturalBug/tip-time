package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var building: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        building = ActivityMainBinding.inflate(layoutInflater)
        setContentView(building.root)
    }
}