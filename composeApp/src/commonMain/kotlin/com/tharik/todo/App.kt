package com.tharik.todo

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.tharik.todo.navigation.NavGraph
import com.tharik.todo.util.darkScheme
import com.tharik.todo.util.lightScheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val colorScheme = if (isSystemInDarkTheme()) darkScheme else lightScheme

    MaterialTheme(colorScheme) {
        NavGraph()
    }
}