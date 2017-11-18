package com.hopeisaprison.ru.batteryhelper.mechanism

import com.hopeisaprison.ru.batteryhelper.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by hopeisaprison on 18.11.17.
 */
@Component (modules = arrayOf(ShellModule::class))
@Singleton
interface AppComponent {

    fun inject(activity : MainActivity)
}