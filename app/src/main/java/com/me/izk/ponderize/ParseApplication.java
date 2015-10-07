package com.me.izk.ponderize;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication  extends Application{
  @Override
  public void onCreate() {
    super.onCreate();

    // Add your initialization code here
    Parse.enableLocalDatastore(this);
    Parse.initialize(this, getString(R.string.parse_one), getString(R.string.parse_two));

    ParseObject testObject = new ParseObject("TestObject");
    testObject.put("foo", "bar");
    testObject.saveInBackground();
  }
}
