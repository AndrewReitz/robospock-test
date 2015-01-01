package com.example;

import timber.log.Timber;

public final class TestClass {
  Class<?> c;

  TestClass() {
    System.out.println("HERE");
    c = Timber.class;
  }

  String getString() {
    return "TEST";
  }
}
