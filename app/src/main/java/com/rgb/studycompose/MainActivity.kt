package com.rgb.studycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rgb.studycompose.ui.theme.StudyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyComposeTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    HelloContent(modifier = Modifier.padding(innerPadding))
//                }
            }
        }
    }
}

