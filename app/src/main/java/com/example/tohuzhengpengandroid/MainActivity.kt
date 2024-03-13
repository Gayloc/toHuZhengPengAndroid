package com.example.tohuzhengpengandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tohuzhengpengandroid.ui.theme.ToHuZhengPengAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToHuZhengPengAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("点击按钮出现胡振鹏最喜欢的图片",)
                }
            }
        }
    }
}

@Composable
fun Greeting(text: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var showImage by remember { mutableStateOf(false) }
        if (showImage) {
            Image(
                painter = painterResource(id = R.drawable.hzp_image),
                contentDescription = null,
            )
        }
        Text(
            text = text,
            style = TextStyle(
                fontWeight = FontWeight.Bold
            ),
            textAlign = TextAlign.Center
        )
        Button(
            onClick = {
                showImage=!showImage
            }
        ) {
            Text(text = "胡振鹏")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ToHuZhengPengAndroidTheme {
        Greeting("Android")
    }
}