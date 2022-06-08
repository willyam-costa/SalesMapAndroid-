package br.com.salesmap

import androidx.fragment.app.Fragment

interface NavigationHost {
    fun navigateTo(fragment: Fragment, addToBackstack: Boolean)
}