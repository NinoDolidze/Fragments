package com.example.fragments.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragments.fragments.*

class ViewPagerFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 7

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentOne()
            1 -> FragmentSecond()
            2 -> FragmentThird()
            3 -> FragmentFourth()
            4 -> FragmentFifth()
            5 -> FragmentSixth()
            6 -> FragmentSeventh()
            else -> FragmentOne()
        }

    }
}