package com.example;

final class Modules {
  static Object[] list(SpockTestApp app) {
    return new Object[]{
        new SpockTestModule(app),
        new DebugSpockTestModule()
    };
  }

  private Modules() {
    // No instances.
  }
}
