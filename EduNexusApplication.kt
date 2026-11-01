package com.edunexus.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

import com.edunexus.app.data.local.DatabaseSeeder

@HiltAndroidApp
class EduNexusApplication : Application() {

    @Inject
    lateinit var databaseSeeder: DatabaseSeeder

    override fun onCreate() {
        super.onCreate()

        databaseSeeder.seedIfRequired()
    }
}