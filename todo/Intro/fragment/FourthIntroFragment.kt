package com.map.todo.Intro.fragment

import android.content.Intent
import android.widget.Button
import com.map.todo.MainActivity
import kotlinx.android.synthetic.main.fragment_fourth_intro.view.*


class FourthIntroFragment : android.support.v4.app.Fragment() {

    lateinit var btnGetStarted: Button

    companion object {
        fun newInstance(pageNum: Int): FourthIntroFragment {

            val fragmentFourth = FourthIntroFragment()

            val bundle = android.os.Bundle()
            bundle.putInt(com.map.todo.utils.KEY_PAGE_NUMBER, pageNum)

            fragmentFourth.arguments = bundle

            return fragmentFourth
        }
    }

    override fun onCreateView(inflater: android.view.LayoutInflater?, container: android.view.ViewGroup?, savedInstanceState: android.os.Bundle?): android.view.View? {
        val view = inflater!!.inflate(com.map.todo.R.layout.fragment_fourth_intro, container, false)

        initialize(view)
        return view
    }

    private fun initialize(view: android.view.View?) {
        btnGetStarted = view!!.btnGetStarted
        btnGetStarted.setOnClickListener({
            startActivity(Intent(activity, MainActivity::class.java))
            activity.finish()
        })
    }
}