package com.ai.edge.pro.core

import android.content.Context
import android.util.Log
import com.ai.edge.pro.system.DeviceController
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ProActionEngine"

/**
 * Hands (FunctionGemma 270M) executor engine.
 * Responsible for executing Android actions and system control.
 */
@Singleton
class ActionEngine @Inject constructor(
    private val deviceController: DeviceController
) {

    fun execute(skillName: String, input: Map<String, Any>) {
        Log.d(TAG, "Executing skill: $skillName with input: $input")

        when (skillName) {
            "mobile.open_app" -> {
                val appName = input["app_name"] as? String ?: return
                deviceController.openApp(appName)
            }
            "system.toggle_wifi" -> {
                deviceController.toggleWifi()
            }
            else -> {
                Log.w(TAG, "No executor for skill: $skillName")
            }
        }
    }
}
