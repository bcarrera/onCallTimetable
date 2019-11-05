package com.oncalltimetable.ui.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.oncalltimetable.R
import kotlinx.android.synthetic.main.fragment_users.*
import org.koin.android.viewmodel.ext.android.viewModel

class UsersFragment : Fragment() {

    private val usersViewModel: UsersViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        subscribeUi()

        return inflater.inflate(R.layout.fragment_users, container, false)
    }

    private fun subscribeUi() {
        usersViewModel.text.observe(this, Observer {
            textUsers.text = it
        })
    }
}