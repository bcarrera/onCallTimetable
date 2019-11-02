package com.oncalltimetable.ui.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.oncalltimetable.R
import kotlinx.android.synthetic.main.fragment_users.*

class UsersFragment : Fragment() {

    private lateinit var usersViewModel: UsersViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        usersViewModel =
                ViewModelProviders.of(this).get(UsersViewModel::class.java)

        subscribeUi()

        return inflater.inflate(R.layout.fragment_users, container, false)
    }

    private fun subscribeUi() {
        usersViewModel.text.observe(this, Observer {
            textUsers.text = it
        })
    }
}