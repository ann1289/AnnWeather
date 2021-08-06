package com.annweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class AnnWeatherApplication : Application() {
    companion object {
        const val TOKEN = "JIliJRgiGRA3sQtY"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}