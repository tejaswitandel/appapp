package com.testfaileds.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.testfaileds.app.R
import com.testfaileds.app.appcomponents.base.BaseActivity
import com.testfaileds.app.databinding.ActivityAppNavigationBinding
import com.testfaileds.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.testfaileds.app.modules.iphone13promax2.ui.Iphone13ProMax2Activity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearIPhone13ProMax1.setOnClickListener {
      val destIntent = Iphone13ProMax2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
