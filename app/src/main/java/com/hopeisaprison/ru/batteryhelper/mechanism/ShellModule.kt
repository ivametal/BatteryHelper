package com.hopeisaprison.ru.batteryhelper.mechanism

import android.util.Log
import dagger.Module
import dagger.Provides
import org.apache.commons.io.IOUtils
import java.nio.charset.StandardCharsets
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by hopeisaprison on 18.11.17.
 */

@Module
@Singleton
class ShellModule @Inject constructor() {


    @Provides
    @Singleton
    fun provideShellUtils() = ShellUtils(Runtime.getRuntime())

    class ShellUtils constructor(private val runtime: Runtime) {

        fun execSu() {
            val process = runtime.exec("su")
        }

        fun getListOfServices() {
            val process = runtime.exec(arrayOf("su","-c", "service list"))
            Log.d("TAG", IOUtils.toString(process.inputStream))
        }
    }



}