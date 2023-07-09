package com.example.gradleplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.testlib.TestValKeeper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valueFromAnotherModule = TestValKeeper.value
        Toast.makeText(this, valueFromAnotherModule, Toast.LENGTH_SHORT).show()
    }
}