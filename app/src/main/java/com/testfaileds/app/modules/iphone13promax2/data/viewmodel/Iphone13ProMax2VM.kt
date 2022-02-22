package com.testfaileds.app.modules.iphone13promax2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testfaileds.app.modules.iphone13promax2.`data`.model.Iphone13ProMax2Model

public class Iphone13ProMax2VM : ViewModel() {
  public val iphone13ProMax2Model: MutableLiveData<Iphone13ProMax2Model> =
      MutableLiveData(Iphone13ProMax2Model())

  public var navArguments: Bundle? = null
}
