package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isNotChecked
import com.atiurin.sampleapp.helper.assertIfViewIsNotDisplayed
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.UiElPage
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object UiElPageSteps {
    fun uiElementsValidation() {
        Assert.assertTrue(UiElPage.webview.isViewDisplayed())
    }

    fun checkClickableBox(): UiElPageSteps {
        UiElPage.checkBoxClickable.tap()
        return this
    }
    fun checkEnabledBox(): UiElPageSteps {
        UiElPage.checkBoxEnabled.tap()
        return this
    }

    fun clickableBoxAssertation(): UiElPageSteps {
        onView(UiElPage.checkBoxClickable).check(matches(isNotChecked()))
        return this
    }
    fun enabledBoxAssertation(): UiElPageSteps {
        onView(UiElPage.checkBoxEnabled).check(matches(isNotChecked()))
        return this
    }
    fun checkInvisibleButton(): UiElPageSteps {
        UiElPage.radioInvisibleButton.tap()
        return this
    }
    fun invisibleButtonAssertation(): UiElPageSteps {
//        Assert.assertFalse(UiElPage.hiddenButton.isViewDisplayed())
        UiElPage.hiddenButton.assertIfViewIsNotDisplayed()
        return this
    }
}
