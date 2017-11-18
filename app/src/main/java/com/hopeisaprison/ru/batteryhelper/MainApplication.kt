package com.hopeisaprison.ru.batteryhelper

import android.app.Application
import com.hopeisaprison.ru.batteryhelper.mechanism.DaggerAppComponent
import com.hopeisaprison.ru.batteryhelper.mechanism.AppComponent
import javax.inject.Inject

/**
 * Created by hopeisaprison on 18.11.17.
 */
class MainApplication : Application() {

    lateinit var shellComponent: AppComponent


    override fun onCreate() {
        super.onCreate()

        shellComponent = DaggerAppComponent.create()
    }




}