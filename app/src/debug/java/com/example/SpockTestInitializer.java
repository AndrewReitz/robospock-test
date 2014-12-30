package com.example;

import android.app.Application;

import javax.inject.Inject;

import timber.log.Timber;

final class SpockTestInitializer {
  private Application application;

  @Inject SpockTestInitializer(Application application) {
    this.application = application;
  }

  /** Init all things debug here */
  void init() {
    Timber.plant(new Timber.DebugTree());
  }
}
