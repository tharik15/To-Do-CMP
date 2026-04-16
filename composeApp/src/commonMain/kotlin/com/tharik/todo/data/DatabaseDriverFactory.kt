package com.tharik.todo.data

import app.cash.sqldelight.db.SqlDriver

interface DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}