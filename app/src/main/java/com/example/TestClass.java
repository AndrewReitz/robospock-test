package com.example;

import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

@Singleton
public final class TestClass {
  @Inject TestClass() {

  }

  public Observable<String> testStuff() {
    return Observable.just("Some Tests Data");
  }
}
