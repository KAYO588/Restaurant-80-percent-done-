package com.example.restaurant

import android.app.Application
import com.example.restaurant.data.DatabaseRepository
import com.example.restaurant.data.GetTableDatabase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        database = GetTableDatabase.getInstance(applicationContext)
        databaseRepositorty = DatabaseRepository(database)
    }

    companion object {
        lateinit var database: GetTableDatabase
            private set

        lateinit var databaseRepositorty: DatabaseRepository
            private set
    }
}