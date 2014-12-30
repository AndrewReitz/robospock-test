package com.example.ui;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.R;
import com.example.SpockTestApp;
import com.example.ui.misc.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
  @Inject AppContainer appContainer;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    SpockTestApp app = SpockTestApp.get(this);
    ViewGroup container = appContainer.get(this, app);

    getLayoutInflater().inflate(R.layout.activity_main, container);
  }
}
