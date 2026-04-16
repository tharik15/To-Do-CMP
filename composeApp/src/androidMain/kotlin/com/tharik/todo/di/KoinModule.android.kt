package com.tharik.todo.di

import com.tharik.todo.data.AndroidDatabaseDriverFactory
import com.tharik.todo.data.DatabaseDriverFactory
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

actual val targetModule = module {
    single<DatabaseDriverFactory> { AndroidDatabaseDriverFactory(androidContext()) }
}