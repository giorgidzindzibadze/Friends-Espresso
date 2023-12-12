package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.swiper
import com.atiurin.sampleapp.pages.FriendsListPage

object ScrollSteps {

    fun swipeDown(x: Int, y: Int, z: Int) {
        swiper(x, y, z)
    }
    fun swipeTo(friendName: String): ScrollSteps {
        FriendsListPage.getListItem(friendName).scrollToItem()
        return this
    }
}
