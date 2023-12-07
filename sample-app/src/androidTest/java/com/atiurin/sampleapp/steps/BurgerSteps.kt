package com.atiurin.sampleapp.steps

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.ClickPage
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.ultron.extensions.tap
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.junit.Assert

object BurgerSteps {
    fun burgerClick(): BurgerSteps {
        UIElementPage.menuBtn.tap()
        return this
    }

    fun customClicksValidation() {
        Assert.assertTrue(ClickPage.topLeft.isViewDisplayed())
    }

    fun actionClick(expectedChatName: String): BurgerSteps {
        val customClicks: Matcher<View> by lazy {
            Matchers.allOf(
                withId(R.id.design_menu_item_text),
                withText(expectedChatName)
            )
        }
        customClicks.tap()
        return this
    }
}
