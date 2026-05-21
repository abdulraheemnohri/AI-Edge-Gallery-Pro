package com.ai.edge.pro.system

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotificationManager @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun showNotification(title: String, message: String) {
        Log.d("ProNotificationManager", "Showing notification: $title - $message")
    }
}
