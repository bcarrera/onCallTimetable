package com.oncalltimetable.ui.calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.oncalltimetable.R
import kotlinx.android.synthetic.main.fragment_calendar.*
import org.koin.android.viewmodel.ext.android.viewModel

class CalendarFragment : Fragment() {

    private val calendarViewModel: CalendarViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        subscribeUi()

        return inflater.inflate(R.layout.fragment_calendar, container, false)
    }

    override fun onStart() {
        super.onStart()
        setListeners()
    }

    private fun subscribeUi() {
        calendarViewModel.getText().observe(this, Observer {
            textCalendar.text = it
        })
    }

    private fun setListeners() {
        buttonCalendar.setOnClickListener { calendarViewModel.onButtonClicked() }
    }
}