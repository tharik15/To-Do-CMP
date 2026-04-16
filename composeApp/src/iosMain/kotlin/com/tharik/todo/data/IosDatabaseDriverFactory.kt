package com.tharik.todo.data

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.tharik.TaskDatabase

class IosDatabaseDriverFactory : DatabaseDriverFactory {
    override fun createDriver(): SqlDriver {
        return NativeSqliteDriver(
            TaskDatabase.Schema,
            "task.db"
        )
    }
}