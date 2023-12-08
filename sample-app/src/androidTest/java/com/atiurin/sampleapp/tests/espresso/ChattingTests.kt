package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Data.Chandler
import com.atiurin.sampleapp.data.Data.buttunToClick
import com.atiurin.sampleapp.data.Data.message
import com.atiurin.sampleapp.steps.BurgerSteps
import com.atiurin.sampleapp.steps.ClickPageSteps
import com.atiurin.sampleapp.steps.FriendsChatSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun textWithMyFriend() {
        FriendsChatSteps.dashboardCheck()
            .openChatWithName(Chandler)
            .checkOpenChat(Chandler)
            .greetFriend(message)
            .assertSentMessage(message)
    }

    @Test
    fun burgetTest() {
        FriendsChatSteps.dashboardCheck()
        BurgerSteps.burgerClick()
            .actionClick(buttunToClick)
            .customClicksValidation()
        ClickPageSteps.checkButtons()
            .buttonsAssertation()
    }
}
