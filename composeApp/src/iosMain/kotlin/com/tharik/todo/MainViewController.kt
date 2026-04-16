package com.tharik.todo

import androidx.compose.ui.window.ComposeUIViewController
import com.tharik.todo.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }