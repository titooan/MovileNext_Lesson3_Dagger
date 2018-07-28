package com.titouan.next.movilenext_lesson3_dependencyinjection.dependencies

class Tweeter(private val api:TwitterApi,
              private val user: String) {

    fun tweet(tweet: String) {
        api.postTweet(user, tweet)
    }
}