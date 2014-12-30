package com.example;

import android.app.Application;

import com.example.data.DataModule;
import com.example.ui.UiModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
    includes = {
        UiModule.class,
        DataModule.class
    },
    injects = {
        SpockTestApp.class
    }
)
public final class SpockTestModule {
  private final SpockTestApp app;

  public SpockTestModule(SpockTestApp app) {
    this.app = app;
  }

  @Provides @Singleton Application provideApplication() {
    return app;
  }
}
