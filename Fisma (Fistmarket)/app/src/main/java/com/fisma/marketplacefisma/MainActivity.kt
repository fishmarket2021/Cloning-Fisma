package com.fisma.marketplacefisma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fisma.marketplacefisma.util.Prefs
import java.util.logging.LogManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("RESPON","PESAN SINGKAT")
    }
}