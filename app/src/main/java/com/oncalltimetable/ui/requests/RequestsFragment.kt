package com.oncalltimetable.ui.requests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.oncalltimetable.R
import kotlinx.android.synthetic.main.fragment_requests.*

class RequestsFragment : Fragment() {

    private lateinit var requestsViewModel: RequestsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        requestsViewModel =
                ViewModelProviders.of(this).get(RequestsViewModel::class.java)

        subscribeUi()

        return inflater.inflate(R.layout.fragment_requests, container, false)
    }

    private fun subscribeUi() {
        requestsViewModel.text.observe(this, Observer {
            textRequests.text = it
        })
    }
}