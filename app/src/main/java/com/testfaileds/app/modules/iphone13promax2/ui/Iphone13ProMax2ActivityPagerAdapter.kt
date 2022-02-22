package com.testfaileds.app.modules.iphone13promax2.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.testfaileds.app.R
import com.testfaileds.app.appcomponents.di.MyApp
import com.testfaileds.app.modules.iphone13promax1.ui.Iphone13ProMax1Fragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class Iphone13ProMax2ActivityPagerAdapter(
    public val fragmentManager: FragmentManager,
    public val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    public override fun getItemCount(): Int = viewPages.size

    public override fun createFragment(position: Int): Fragment = viewPages[position]

    public companion object AdapterConstant {
        public val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_homepage),MyApp.getInstance().resources.getString(R.string.lbl_popular),MyApp.getInstance().resources.getString(R.string.lbl_recent))

        public val viewPages: List<Fragment> =
                listOf(Iphone13ProMax1Fragment(),Iphone13ProMax1Fragment(),Iphone13ProMax1Fragment())

    }
}
