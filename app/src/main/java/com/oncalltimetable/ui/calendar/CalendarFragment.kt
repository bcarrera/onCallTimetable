package com.oncalltimetable.ui.calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.oncalltimetable.R
import kotlinx.android.synthetic.main.fragment_calendar.*

class CalendarFragment : Fragment() {

    private lateinit var calendarViewModel: CalendarViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        calendarViewModel =
                ViewModelProviders.of(this).get(CalendarViewModel::class.java)

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