package com.example.learninghilt

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learninghilt.ui.AppInterface
import com.example.learninghilt.ui.AppModule
import com.example.learninghilt.ui.DaggerAppInterface


import com.example.learninghilt.ui.theme.LearningHiltTheme
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent()

        val appInterface: AppInterface = DaggerAppInterface.create()
        Log.d("TAG", "Car" + appInterface.car)

    }


}
