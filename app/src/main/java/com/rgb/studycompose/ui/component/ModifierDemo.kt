package com.rgb.studycompose.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rgb.studycompose.ui.theme.StudyComposeTheme

@Composable
fun LayoutPropertiesDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Tamanho Fixo
        Box(
            modifier = modifier
                .size(100.dp)
                .background(Color.Red)
        )

        //Prenchimento baseado em largura e altura total
        Box(
            modifier = modifier
                .fillMaxHeight(0.5f)
                .width(100.dp)
                .background(Color.Green)
        )

        // offset de posição
        Box(
            modifier = modifier
                .size(100.dp)
                .offset(x = (-100).dp, y = 25.dp)
                .background(Color.Blue)
        )

        // Aspect ratio fixo
        Box(
            modifier = modifier
                .height(100.dp)
                .aspectRatio(16f / 9f)
                .background(Color.Magenta)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Gray),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
            )
            Box(
                modifier = modifier
                    .weight(2f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun LayoutPropertiesDemoPreview() {
    StudyComposeTheme {
        LayoutPropertiesDemo()
    }
}