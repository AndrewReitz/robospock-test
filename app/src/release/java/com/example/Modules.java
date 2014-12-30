package com.example;

final class Modules {
    static Object[] list(SpockTestApp app) {
        return new Object[]{
                new SpockTestModule(app)
        };
    }

    private Modules() {
        // No instances.
    }
}
