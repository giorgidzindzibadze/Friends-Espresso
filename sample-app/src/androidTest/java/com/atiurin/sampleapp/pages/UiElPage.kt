package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object UiElPage {
    val webview: Matcher<View> by lazy { ViewMatchers.withId(R.id.webview) }
    val checkBoxClickable: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_clickable) }
    val checkBoxEnabled: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_enable) }
    val hiddenButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.button1) }
    val radioInvisibleButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.radio_invisible) }

}
