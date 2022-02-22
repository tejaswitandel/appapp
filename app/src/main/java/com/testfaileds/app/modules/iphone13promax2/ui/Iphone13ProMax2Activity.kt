package com.testfaileds.app.modules.iphone13promax2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.testfaileds.app.R
import com.testfaileds.app.appcomponents.base.BaseActivity
import com.testfaileds.app.databinding.ActivityIphone13ProMax2Binding
import com.testfaileds.app.modules.iphone13promax2.`data`.viewmodel.Iphone13ProMax2VM
import kotlin.String
import kotlin.Unit

public class Iphone13ProMax2Activity :
    BaseActivity<ActivityIphone13ProMax2Binding>(R.layout.activity_iphone_13_pro_max_2) {
  private val viewModel: Iphone13ProMax2VM by viewModels<Iphone13ProMax2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone13ProMax2VM = viewModel
    val adapter = Iphone13ProMax2ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup9.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup4,binding.viewPagerGroup9) { tab, position ->
      tab.text = Iphone13ProMax2ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "IPHONE13PRO_MAX2ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone13ProMax2Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
