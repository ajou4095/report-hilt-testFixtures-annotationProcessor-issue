package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [AppModule::class]
)
object AppModuleTest {

    @Provides
    @Singleton
    @SomeString
    internal fun provideSomeString(): String {
        return "Test"
    }
}
