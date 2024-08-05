package com.example.hilt;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.testing.TestInstallIn;

@Module
@TestInstallIn(
        components = {SingletonComponent.class},
        replaces = {AppModule.class}
)
public class AppModuleTest {

    @Provides
    @Singleton
    @SomeString
    public String provideSomeString() {
        return "Test";
    }
}
