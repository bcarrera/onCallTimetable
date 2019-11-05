package com.oncalltimetable.ui.requests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.oncalltimetable.R
import kotlinx.android.synthetic.main.fragment_requests.*
import org.koin.android.viewmodel.ext.android.viewModel

class RequestsFragment : Fragment() {

    private val requestsViewModel: RequestsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        subscribeUi()

        return inflater.inflate(R.layout.fragment_requests, container, false)
    }

    private fun subscribeUi() {
        requestsViewModel.text.observe(this, Observer {
            textRequests.text = it
        })
    }
}