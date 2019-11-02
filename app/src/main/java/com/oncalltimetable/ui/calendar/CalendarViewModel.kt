package com.oncalltimetable.ui.calendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalendarViewModel : ViewModel() {

    companion object {
        const val OLD_TEXT = "This is calendar Fragment"
        const val NEW_TEXT = "This is a new text"
    }
    private lateinit var text: MutableLiveData<String>

    fun getText(): LiveData<String> {
        if(!::text.isInitialized) {
            text = MutableLiveData()
            text.value = OLD_TEXT
        }

        return text
    }

    fun onButtonClicked() {
        if(text.value == OLD_TEXT) {
            text.value = NEW_TEXT
        } else {
            text.value = OLD_TEXT
        }
    }

}