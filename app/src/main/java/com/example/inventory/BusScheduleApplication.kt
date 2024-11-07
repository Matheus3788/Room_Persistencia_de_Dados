package com.example.inventory

import android.app.Application
import com.example.inventory.data.AppDatabase

class BusScheduleApplication: Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}