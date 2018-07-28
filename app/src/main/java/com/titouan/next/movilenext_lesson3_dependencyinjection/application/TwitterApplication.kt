package com.titouan.next.movilenext_lesson3_dependencyinjection.application

import com.titouan.next.movilenext_lesson3_dependencyinjection.dependencies.Streaming
import com.titouan.next.movilenext_lesson3_dependencyinjection.dependencies.Timeline
import com.titouan.next.movilenext_lesson3_dependencyinjection.dependencies.Tweeter
import javax.inject.Inject

class TwitterApplication /*@Inject constructor(
        private val tweeter: Tweeter,
        private val timeline: Timeline) */ {

    @Inject
    lateinit var tweeter: Tweeter

    @Inject
    lateinit var timeline: Timeline

    @Inject
    fun enableStreaming(streaming: Streaming) {
        streaming.register(this)
    }


}