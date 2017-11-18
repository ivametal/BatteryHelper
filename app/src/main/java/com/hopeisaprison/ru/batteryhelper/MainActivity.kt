package com.hopeisaprison.ru.batteryhelper

import android.app.ActivityManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hopeisaprison.ru.batteryhelper.mechanism.ShellModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var shellUtils : ShellModule.ShellUtils


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MainApplication).shellComponent.inject(this)

        shellUtils.execSu()

        shellUtils.getListOfServices()
    }
}
