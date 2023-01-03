package com.example.obfuscationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.onfuscationsample.ApiHandler
import com.example.onfuscationsample.Sample
import com.example.onfuscationsample.SampleEnum

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Sample().openMethod(SampleEnum.BANNER)
        Log.d("Data =>", ApiHandler().createSession().toString())
    }
}