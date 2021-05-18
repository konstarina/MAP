package com.map.todo.Intro.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.map.todo.Intro.fragment.FirstIntroFragment
import com.map.todo.Intro.fragment.FourthIntroFragment
import com.map.todo.Intro.fragment.SecondIntroFragment
import com.map.todo.Intro.fragment.ThirdIntroFragment
import com.map.todo.utils.TOTAL_INTRO_PAGES


class IntroAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {


    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return FirstIntroFragment.newInstance(0)
            1 -> return SecondIntroFragment.newInstance(1)
            2 -> return ThirdIntroFragment.newInstance(2)
            3 -> return FourthIntroFragment.newInstance(3)
            else -> return ThirdIntroFragment.newInstance(2)
        }
    }

    override fun getCount(): Int {
        return TOTAL_INTRO_PAGES
    }
}