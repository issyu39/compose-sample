package com.example.composesample.ui.screens.home

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.composesample.R
import com.example.composesample.ui.theme.ComposeSampleTheme

@Composable
fun HomeScreen() {
    ComposeSampleTheme {
        Column(modifier = Modifier.background(colorResource(id = R.color.navy))) {
            TopAppBar(
                title = {
                    Text(text = "Compose Sample")
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Btn")
                    }
                },
                backgroundColor = Color.Transparent,
                contentColor = Color.White,
                elevation = 2.dp
            )
            HomeContents()
        }

    }
}

@Composable
fun HomeContents() {
    Column(
        modifier = Modifier
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