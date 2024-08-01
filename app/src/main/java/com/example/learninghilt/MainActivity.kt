package com.example.learninghilt

import android.app.Activity
import android.app.Application
import android.content.Context
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
import com.example.learninghilt.ui.AppComponent
import com.example.learninghilt.ui.AppModule
import com.example.learninghilt.ui.ComputerConfig
import com.example.learninghilt.ui.DaggerAppComponent
import com.example.learninghilt.ui.theme.LearningHiltTheme
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainApp : Application(){
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

}

val Context.appComponent: AppComponent
    get() = when (this) {
        is MainApp -> appComponent
        else -> this.applicationContext.appComponent
    }

class MainActivity : Activity(){

    @Inject
    lateinit var computerConfig: ComputerConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       appComponent.inject(this) // Теперь она автоматом будет получать инжект
        Log.d("TAG", "Car" + appComponent.comp)


    }


}
