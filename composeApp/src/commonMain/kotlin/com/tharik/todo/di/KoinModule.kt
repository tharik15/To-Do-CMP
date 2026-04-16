package com.tharik.todo.di

import com.tharik.todo.data.ToDoRepositoryImpl
import com.tharik.todo.domain.ToDoRepository
import com.tharik.todo.navigation.Navigator
import com.tharik.todo.presentation.screen.home.HomeViewModel
import com.tharik.todo.presentation.screen.task.TaskViewModel
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

expect val targetModule: Module

val koinModule = module {
    singleOf(constructor = ::Navigator)
//    single<ToDoRepository> { FakeToDoRepository() }
    single<ToDoRepository> { ToDoRepositoryImpl(get()) }

    viewModelOf(::HomeViewModel)
    viewModelOf(::TaskViewModel)
}

fun initializeKoin(
    config: (KoinApplication. () -> Unit)? = null
) {
    startKoin {
        config?.invoke(this)
        modules(koinModule, targetModule)
    }
}