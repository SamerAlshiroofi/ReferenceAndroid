package com.abnamro.apps.referenceandroid

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.abnamro.apps.referenceandroid.util.SmokeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class FabText {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @SmokeTest
    @Test
    fun FabText() {
            onView(withId(R.id.fab))
                .perform(click())
            isClickable()
            isDisplayed()
            onView(withText("Replace with your own action"))
                .check(matches(withText("Replace with your own action")))
                .check(matches(isDisplayed()))
    }
}
