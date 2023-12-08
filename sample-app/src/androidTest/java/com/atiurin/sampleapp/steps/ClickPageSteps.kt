package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.pages.ClickPage
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object ClickPageSteps {
    fun checkButtons(): ClickPageSteps {
        with(ClickPage) {
            bottomLeft.tap()
            topLeft.tap()
            topRight.tap()
            bottomRight.tap()
        }
        return this
    }

    fun buttonsAssertation(): ClickPageSteps {
        with(ClickPage) {
            Assert.assertTrue(topLeft.isChecked())
            Assert.assertTrue(bottomLeft.isChecked())
            Assert.assertTrue(bottomRight.isChecked())
            Assert.assertTrue(topRight.isChecked())
        }
        return this
    }
}
