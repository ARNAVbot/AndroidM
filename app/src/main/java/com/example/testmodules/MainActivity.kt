package com.example.testmodules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.network.NetworkConstants.PAYMENTS_CONSTANTS
import com.example.network.NetworkConstants.PAYMENTS_CONSTANTS_2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startPaymentsActivity()

    }

    fun startPaymentsActivity() {
        println(PAYMENTS_CONSTANTS)
        println(PAYMENTS_CONSTANTS_2)
    }
}