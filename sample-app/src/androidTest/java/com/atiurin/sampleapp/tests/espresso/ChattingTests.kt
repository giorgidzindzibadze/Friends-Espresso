package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Data.Emmet
import com.atiurin.sampleapp.data.Data.button
import com.atiurin.sampleapp.data.Data.friend
import com.atiurin.sampleapp.data.Data.text
import com.atiurin.sampleapp.steps.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

//    @Test
//    fun textWithMyFriend() {
//        FriendsChatSteps.dashboardCheck()
//            .openChatWithName(Chandler)
//            .checkOpenChat(Chandler)
//            .greetFriend(message)
//            .assertSentMessage(message)
//    }
//
//    @Test
//    fun burgetTest() {
//        FriendsChatSteps.dashboardCheck()
//        BurgerSteps.burgerClick()
//            .actionClick(buttunToClick)
//            .customClicksValidation()
//        ClickPageSteps.checkButtons()
//            .buttonsAssertation()
//    }

    @Test
    fun swipeTest() {
//        Thread.sleep(3000) //თავიდან აერორებდა sleep ის გარეშე შემდეგ გაეშვა, თუ დაერორდა მოუშალეთ კომენტარი
        ScrollSteps.swipeDown(300, 100, 10)
        MainPageSteps.openChatWithName(Emmet)
        FriendsChatSteps.checkOpenChat(Emmet)
            .greetFriend(text)
            .assertSentMessage(text)
        Thread.sleep(3000)
    }

    @Test
    fun swipeTest2() {
        ScrollSteps.swipeTo(friend)
        MainPageSteps.openChatWithName(friend)
        with(FriendsChatSteps) {
            checkOpenChat(friend)
                .greetFriend(text)
                .assertSentMessage(text)
        }
    }

    @Test
    fun MainTest() {
        BurgerSteps.burgerClick()
            .actionClick(button)
        with(UiElPageSteps) {
            uiElementsValidation()
            checkClickableBox()
            checkEnabledBox()
            clickableBoxAssertation()
            enabledBoxAssertation()
            checkInvisibleButton()
            invisibleButtonAssertation()
        }
    }
}
