package com.rgb.studycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rgb.studycompose.ui.theme.StudyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(
        Modifier
            .padding(10.dp)
            .border(width = 4.dp, color = Color.Red, RectangleShape)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Blue, shape = RectangleShape)
            .padding(10.dp),
    ) {
        Text(
            fontSize = 22.sp,
            color = Color.Red,
            text = "Hello $name!",
            modifier = Modifier.padding(start = 50.dp),
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.SansSerif,
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.LineThrough,
                    TextDecoration.Underline
                )
            )
        )
        Text(
            text = "Download it from PlayStore", textDecoration = TextDecoration.Underline,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StudyComposeTheme {
        Greeting(
            "Hello Master coding App"
        )
    }
}