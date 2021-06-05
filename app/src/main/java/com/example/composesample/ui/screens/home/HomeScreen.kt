package com.example.composesample.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composesample.ui.theme.ComposeSampleTheme

@Composable
fun HomeScreen() {
    ComposeSampleTheme {
        Scaffold(
            topBar = { HomeTopBar() },
            content = { HomeContents() },
        )
    }
}

@Composable
fun HomeTopBar() {
    TopAppBar(
        title = { Text(text = "Compose Sample") },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Btn")
            }
        },
        backgroundColor = MaterialTheme.colors.primaryVariant,
        contentColor = Color.White
    )
}

@Composable
fun HomeContents() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Home",
            color = Color.White,
            modifier = Modifier.padding(48.dp)
        )
        Button(
            onClick = { /* Do something */ }
        ) {
            Text("Button")
        }
    }
}