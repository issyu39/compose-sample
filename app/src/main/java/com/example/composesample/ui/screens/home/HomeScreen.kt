package com.example.composesample.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composesample.R
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
    LazyColumn(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 8.dp, end = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Card(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(16.dp),
            ) {
                Image(
                    painterResource(R.drawable.list_background_1),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                )
            }
        }
        item {
            Card(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(16.dp),
            ) {
                Image(
                    painterResource(R.drawable.list_background_2),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                )
            }
        }
        item {
            Card(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(16.dp),
            ) {
                Image(
                    painterResource(R.drawable.list_background_3),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                )
            }
        }
        item {
            Card(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(16.dp),
            ) {
                Image(
                    painterResource(R.drawable.list_background_4),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                )
            }
        }
        item {
            Card(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(16.dp),
            ) {
                Image(
                    painterResource(R.drawable.list_background_5),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                )
            }
        }
        item {
            Card(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(16.dp),
            ) {
                Image(
                    painterResource(R.drawable.list_background_6),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                )
            }
        }
    }
}