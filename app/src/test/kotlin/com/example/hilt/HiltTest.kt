package com.example.hilt

import androidx.test.ext.junit.runners.AndroidJUnit4
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import javax.inject.Inject
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
@Config(
    application = HiltTestApplication::class,
    manifest = Config.NONE
)
class TokenRepositoryTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    @SomeString
    lateinit var someString: String

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun checkSomeString() = runTest {
        println("someString: $someString")
        // To be "Test" instead of "Main"

        assert(someString != "Main")
        assert(someString == "Test")
    }
}
