package com.example.testlib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testlib2.TestLib2Activity

class TestLibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_lib)
        startActivity(Intent(this, TestLib2Activity::class.java))
    }
}