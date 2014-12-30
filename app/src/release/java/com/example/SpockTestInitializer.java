package com.example;

import android.app.Application;

import javax.inject.Inject;

final class SpockTestInitializer {
  private final Application application;

  @Inject SpockTestInitializer(Application application) {
    this.application = application;
  }

  /** Init all things release here */
  void init() {
    /* Ex. Timber.plant(new CrashReportingTree()); */
  }
}

