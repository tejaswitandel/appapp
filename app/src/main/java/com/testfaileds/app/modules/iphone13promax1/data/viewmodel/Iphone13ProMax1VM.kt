package com.testfaileds.app.modules.iphone13promax1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testfaileds.app.modules.iphone13promax1.`data`.model.Iphone13ProMax1Model

public class Iphone13ProMax1VM : ViewModel() {
  public val iphone13ProMax1Model: MutableLiveData<Iphone13ProMax1Model> =
      MutableLiveData(Iphone13ProMax1Model())

  public var navArguments: Bundle? = null
}
