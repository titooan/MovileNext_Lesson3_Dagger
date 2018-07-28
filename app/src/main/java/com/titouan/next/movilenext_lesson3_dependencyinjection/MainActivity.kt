package com.titouan.next.movilenext_lesson3_dependencyinjection

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.titouan.next.movilenext_lesson3_dependencyinjection.injection.DaggerTwitterComponent
import com.titouan.next.movilenext_lesson3_dependencyinjection.injection.TwitterModule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerTwitterComponent.builder()
//                .networkModule(NetworkModule()) //useless, dagger can infer it
                .twitterModule(TwitterModule("Titouan"))
                .build()

        val tweeter = component.tweeter()
        val timeline = component.timeline()

        tweeter.tweet("Hey")

    }

}