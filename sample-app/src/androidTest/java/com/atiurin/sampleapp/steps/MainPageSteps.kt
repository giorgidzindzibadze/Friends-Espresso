package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.FriendsListPage
import com.atiurin.sampleapp.pages.UIElementPage
import org.junit.Assert

object MainPageSteps {
    fun dashboardCheck(): MainPageSteps {
        Assert.assertTrue(UIElementPage.dashboard.isViewDisplayed())
        return this
    }

    fun openChatWithName(friendName: String): MainPageSteps {
        FriendsListPage.openChat(friendName)
        return this
    }
}