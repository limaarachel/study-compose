package com.rgb.studycompose.ui.component.modifierdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rgb.studycompose.ui.theme.StudyComposeTheme
const val X = 100f
@Composable
fun VisualPropertiesDemo(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = modifier
                .size(200.dp)
                .background(Color(red = 100, green = 255, blue = 100, alpha = 100))
        )
//            .background(
//                brush = Brush.horizontalGradient(
//                    listOf(
//                        Color.Yellow,
//                        Color.Green,
//                        Color.Blue
//                    )
//                )
//            )
//        )
        //  .background(color = Color(color = 0xFF0044FF)))
//border
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color(red = 255, green = 0, blue = 0, alpha = 100))
                .border(width = 2.dp, color = Color.Black, shape = CircleShape)
        )
        // sombra
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color(red = 0, green = 255, blue = 0, alpha = 255))
                .shadow(elevation = 8.dp, shape = RoundedCornerShape(8.dp))
        )

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color(red = 255, green = 255, blue = 0, alpha = 255))
                .graphicsLayer {
                    val rotationZ = X * 0.15f
                    this.rotationZ = rotationZ
                    rotationX = 15f

                    scaleY = 5f
                }
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewVisualProperties() {
    StudyComposeTheme {
        VisualPropertiesDemo()
    }
}