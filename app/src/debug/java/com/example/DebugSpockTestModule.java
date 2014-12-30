package com.example;

import com.example.data.DebugDataModule;
import com.example.ui.DebugUiModule;

import dagger.Module;

@Module(
    addsTo = SpockTestModule.class,
    includes = {
        DebugUiModule.class,
        DebugDataModule.class
    },
    overrides = true
)
public final class DebugSpockTestModule {
}
