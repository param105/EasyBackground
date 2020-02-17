package com.param.easybackground.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlin.concurrent.thread

class BasicService:Service(){

    var TAG = "BasicService"


    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Service Created")
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        startCount()
        return super.onStartCommand(intent, flags, startId)
    }

    private fun startCount() {

        Thread(Runnable {
            for (i in 1..10){
                Log.d(TAG, "Service count is $i")
                Thread.sleep(1000)
            }
            stopSelf()
        }).start()



    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Service Destroyed")

    }

    }
