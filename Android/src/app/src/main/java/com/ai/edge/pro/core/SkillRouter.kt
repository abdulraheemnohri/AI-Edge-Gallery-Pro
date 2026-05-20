package com.ai.edge.pro.core

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ProSkillRouter"

@Singleton
class SkillRouter @Inject constructor(
    private val brainEngine: BrainEngine,
    private val skillRegistry: SkillRegistry
) {

    suspend fun route(intent: String): ProSkill? {
        Log.d(TAG, "Routing intent: $intent")
        val plan = brainEngine.analyze(intent)

        return skillRegistry.findBestMatch(
            plan.intent,
            plan.context
        )
    }
}
