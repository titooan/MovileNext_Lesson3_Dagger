package com.titouan.next.movilenext_lesson3_dependencyinjection.dependencies

import okhttp3.OkHttpClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TwitterApi @Inject constructor(
        private val client: OkHttpClient) {

    fun postTweet(user: String, tweet: String) {

    }
}