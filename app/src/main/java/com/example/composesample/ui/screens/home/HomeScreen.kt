package com.example.composesample.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.composesample.ui.theme.ComposeSampleTheme

@Composable
fun HomeScreen() {
    ComposeSampleTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Column {
                Text("Hello World")
            }
        }
    }
}