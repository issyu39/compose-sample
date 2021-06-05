package com.example.composesample.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.example.composesample.ui.navigation.MainNavigator
import com.example.composesample.ui.theme.ComposeSampleTheme
import com.google.accompanist.systemuicontroller.LocalSystemUiController
import com.google.accompanist.systemuicontroller.rememberAndroidSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            // Remember a controller, and provide it to the LocalSystemUiController
            val controller = rememberAndroidSystemUiController()
            CompositionLocalProvider(LocalSystemUiController provides controller) {
                ComposeSampleTheme {
                    // Get the current SystemUiController
                    val systemUiController = LocalSystemUiController.current
                    val useDarkIcons = MaterialTheme.colors.isLight
                    SideEffect {
                        // Update all of the system bar colors to be transparent, and use
                        // dark icons if we're in light theme
                        systemUiController.setSystemBarsColor(
                            color = Color.Transparent,
                            darkIcons = useDarkIcons
                        )
                    }
                    MainNavigator()
                }
            }
        }
    }
}
