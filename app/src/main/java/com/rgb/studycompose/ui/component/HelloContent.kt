package com.rgb.studycompose.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rgb.studycompose.R
import com.rgb.studycompose.ui.theme.StudyComposeTheme
import com.rgb.studycompose.ui.theme.Typography

@Composable
fun HelloContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var name by remember { mutableStateOf(value = "") }

        if (name.isNotEmpty()) {
            Text(
                text = stringResource(R.string.hello, name),
                modifier = Modifier.padding(bottom = 8.dp),
                style = Typography.bodyMedium
            )
        }
        OutlinedTextField(
            value = name,
            onValueChange = { updatedName -> name = updatedName },
            label = { Text(text = stringResource(id = R.string.name)) }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HelloContentPreview() {
    StudyComposeTheme {
        HelloContent()
    }
}

@Composable
fun GreetingPreview() {
    StudyComposeTheme {
        Greeting(
            "Hello Master coding App"
        )
    }
}

@Composable
fun DisplayImage() {
    val myPainter = painterResource(R.drawable.ic_launcher_background)
    Image(painter = myPainter, contentDescription = "dog")
}


@Composable
fun FilledButton(onClickButton: () -> Unit) {
    Button(onClick = {
        onClickButton()
    }) {
        Text("Click me!")
    }
}

@Composable
fun FilledTonalButtonFunction(onClickButton: () -> Unit) {
    FilledTonalButton(onClick = {
        onClickButton()
    }) {
        Text("Click tonal button!")
    }}