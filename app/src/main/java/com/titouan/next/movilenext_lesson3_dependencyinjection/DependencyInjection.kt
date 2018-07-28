package com.titouan.next.movilenext_lesson3_dependencyinjection

/*
class Twitter(private val api:TwitterApi,
              private val user: String) {

    fun tweet(tweet: String) {
        api.postTweet(user, tweet)
    }
}

class TwitterApi(private val client: OkHttpClient) {

    fun postTweet(user: String, tweet: String) {
        val request = Request.Builder.build()
        client.newCall(request).execute()
    }
}

class Timeline(private val api:TwitterApi,
               private val user: String) {

    private val cache: List<Tweet> = emptyList()

    fun get() = cache
    fun loadMore(amount: Int) { }

}

fun execute() {
    val user = "Titouan"
    val client = OkHttpClient()
    val twitterApi = TwitterApi(client)

    val twitter = Twitter(twitterApi, user)
    twitter.tweet("Hello, #DependencyInjection")
    twitter.tweet("And one more tweet")

    val timeline = Timeline(twitterApi, user)
    timeline.loadMore(20)

    for (tweet in timeline.get()) {
        println(tweet)
    }
}*/
