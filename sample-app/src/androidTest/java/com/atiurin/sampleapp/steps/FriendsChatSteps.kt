package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.ChatPage
import com.atiurin.sampleapp.pages.FriendsListPage
import com.atiurin.sampleapp.pages.UIElementPage
import org.junit.Assert

object FriendsChatSteps {

    fun dashboardCheck(): FriendsChatSteps {
        Assert.assertTrue(UIElementPage.dashboard.isViewDisplayed())
        return this
    }

    fun openChatWithName(friendName: String): FriendsChatSteps {
        FriendsListPage.openChat(friendName)
        return this
    }

    fun checkOpenChat(expectedChatName: String): FriendsChatSteps {
        ChatPage.assertToolbarTitle(expectedChatName)
        return this
    }

    fun greetFriend(message: String): FriendsChatSteps {
        ChatPage.sendMessage(message)
        return this
    }

    fun assertSentMessage(message: String): FriendsChatSteps {
        ChatPage.assertMessageDisplayed(message)
        return this
    }
}
