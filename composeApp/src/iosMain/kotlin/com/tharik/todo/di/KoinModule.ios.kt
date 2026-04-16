package com.tharik.todo.di

import com.tharik.todo.data.DatabaseDriverFactory
import com.tharik.todo.data.IosDatabaseDriverFactory
import org.koin.dsl.module

actual val targetModule = module {
    single<DatabaseDriverFactory> { IosDatabaseDriverFactory() }
}