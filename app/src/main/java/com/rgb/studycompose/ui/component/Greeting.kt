package com.rgb.studycompose.ui.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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