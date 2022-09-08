package com.example.pixaby

import android.app.Application
import com.example.pixaby.network.PixabyApi
import com.example.pixaby.network.RetrofitService

class App : Application() {

    companion object{
        lateinit var api: PixabyApi
    }

    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api = retrofitService.getApi()

    }

}