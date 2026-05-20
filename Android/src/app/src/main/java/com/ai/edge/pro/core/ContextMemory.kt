package com.ai.edge.pro.core

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ProContextMemory"

@Singleton
class ContextMemory @Inject constructor() {

    private val sessionHistory = mutableListOf<String>()
    private val userHabits = mutableMapOf<String, Int>()

    fun recordAction(action: String) {
        Log.d(TAG, "Recording action: $action")
        sessionHistory.add(action)
        userHabits[action] = (userHabits[action] ?: 0) + 1
    }

    fun getSuggestedActions(): List<String> {
        return userHabits.entries
            .sortedByDescending { it.value }
            .take(3)
            .map { it.key }
    }
}
