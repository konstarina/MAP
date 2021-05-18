package com.map.todo.Intro.fragment


class ThirdIntroFragment : android.support.v4.app.Fragment() {

    companion object {
        fun newInstance(pageNum: Int): com.map.todo.Intro.fragment.ThirdIntroFragment {

            val fragmentThird = com.map.todo.Intro.fragment.ThirdIntroFragment()

            val bundle = android.os.Bundle()
            bundle.putInt(com.map.todo.utils.KEY_PAGE_NUMBER, pageNum)

            fragmentThird.arguments = bundle

            return fragmentThird
        }
    }

    override fun onCreateView(inflater: android.view.LayoutInflater?, container: android.view.ViewGroup?, savedInstanceState: android.os.Bundle?): android.view.View? {
        val view = inflater!!.inflate(com.map.todo.R.layout.fragment_third_intro, container, false)

        initialize(view)
        return view
    }

    private fun initialize(view: android.view.View?) {

    }
}