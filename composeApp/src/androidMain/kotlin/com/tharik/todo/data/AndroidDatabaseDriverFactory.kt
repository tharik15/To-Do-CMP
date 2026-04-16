package com.tharik.todo.data

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.tharik.TaskDatabase

class AndroidDatabaseDriverFactory(
    private val context: Context,
) : DatabaseDriverFactory {
    override fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
            TaskDatabase.Schema,
            context,
            "task.db"
        )
    }
}