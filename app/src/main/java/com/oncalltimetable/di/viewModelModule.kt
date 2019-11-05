package com.oncalltimetable.di

import com.oncalltimetable.ui.calendar.CalendarViewModel
import com.oncalltimetable.ui.requests.RequestsViewModel
import com.oncalltimetable.ui.users.UsersViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { CalendarViewModel() }
    viewModel { RequestsViewModel() }
    viewModel { UsersViewModel() }

}