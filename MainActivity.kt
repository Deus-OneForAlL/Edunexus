package com.edunexus.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint

import com.edunexus.app.core.design.EduNexusTheme
import com.edunexus.app.core.navigation.EduNexusNavigation

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            EduNexusTheme {
                EduNexusNavigation()
            }
        }
    }
}