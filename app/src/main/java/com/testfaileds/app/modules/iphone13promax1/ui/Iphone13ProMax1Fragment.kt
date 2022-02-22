package com.testfaileds.app.modules.iphone13promax1.ui

import androidx.fragment.app.viewModels
import com.testfaileds.app.R
import com.testfaileds.app.appcomponents.base.BaseFragment
import com.testfaileds.app.databinding.FragmentIphone13ProMax1Binding
import com.testfaileds.app.modules.iphone13promax1.`data`.viewmodel.Iphone13ProMax1VM
import kotlin.String
import kotlin.Unit

public class Iphone13ProMax1Fragment :
    BaseFragment<FragmentIphone13ProMax1Binding>(R.layout.fragment_iphone_13_pro_max_1) {
  private val viewModel: Iphone13ProMax1VM by viewModels<Iphone13ProMax1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone13ProMax1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "IPHONE13PRO_MAX1FRAGMENT"
  }
}
