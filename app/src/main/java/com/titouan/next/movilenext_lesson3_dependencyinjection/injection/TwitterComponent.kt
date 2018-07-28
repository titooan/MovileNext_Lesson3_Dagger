package com.titouan.next.movilenext_lesson3_dependencyinjection.injection

import com.titouan.next.movilenext_lesson3_dependencyinjection.dependencies.Timeline
import com.titouan.next.movilenext_lesson3_dependencyinjection.dependencies.Tweeter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, TwitterModule::class])
interface TwitterComponent {

    fun tweeter(): Tweeter
    fun timeline(): Timeline
}