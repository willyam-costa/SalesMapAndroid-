package br.com.salesmap.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import br.com.salesmap.NavigationHost
import br.com.salesmap.R



class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }


//TODO: navigation buttom login activity
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val login_button: Button = view.findViewById(R.id.login_button)
        login_button.setOnClickListener {
            (activity as NavigationHost).navigateTo(MenuFragment(), addToBackstack = true)
        }
    }


//TODO: navigation button cadastro activity




    companion object {

    }
}