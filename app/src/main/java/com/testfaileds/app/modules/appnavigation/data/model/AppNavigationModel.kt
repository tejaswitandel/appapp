package com.testfaileds.app.modules.appnavigation.`data`.model

import com.testfaileds.app.R
import com.testfaileds.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIPhone13ProMax1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_13_pro_m)

)
