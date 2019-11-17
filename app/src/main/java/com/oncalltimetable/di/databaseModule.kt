package com.oncalltimetable.di

import com.oncalltimetable.data.db.OnCallTimetableDB
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val roomModule = module {
    single { OnCallTimetableDB.getDatabase(androidApplication()) }
    single(createdAtStart = false) { get<OnCallTimetableDB>().userDao() }
}