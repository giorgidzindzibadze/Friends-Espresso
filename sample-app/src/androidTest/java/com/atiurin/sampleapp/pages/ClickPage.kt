package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object ClickPage {
    val bottomLeft: Matcher<View> by lazy { withId(R.id.rB_bottom_left) }
    val topLeft: Matcher<View> by lazy { withId(R.id.rB_top_left) }
    val topRight: Matcher<View> by lazy { withId(R.id.rB_top_right) }
    val bottomRight: Matcher<View> by lazy { withId(R.id.rB_bottom_right) }
}
