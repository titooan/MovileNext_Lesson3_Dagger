package com.titouan.next.movilenext_lesson3_dependencyinjection.dependencies

class Timeline(private val api: TwitterApi,
               private val user: String) {

    private val cache: List<Tweet> = emptyList()

    fun get() = cache

    fun loadMore(amout: Int) {

    }
}