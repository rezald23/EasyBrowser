package org.hseury.easybrowser.activities;

import android.app.Application;
import com.tencent.smtt.sdk.QbSdk;

/**
 * Created by hseury on 8/10/17.
 */

public class BrowserApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    //init x5 WebView
    QbSdk.initX5Environment(this,null);
  }
}
