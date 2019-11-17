package com.oncalltimetable.base

import android.app.Application
import com.oncalltimetable.di.appModule
import com.oncalltimetable.di.roomModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class OnCallTimetableApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin{
            androidLogger()
            androidContext(this@OnCallTimetableApplication)
            modules(listOf(appModule, roomModule))
        }
    }

}