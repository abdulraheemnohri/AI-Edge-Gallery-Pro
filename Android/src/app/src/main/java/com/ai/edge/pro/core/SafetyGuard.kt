package com.ai.edge.pro.core

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ProSafetyGuard"

@Singleton
class SafetyGuard @Inject constructor() {

    fun checkRisk(skill: ProSkill): RiskAssessment {
        Log.d(TAG, "Checking risk for skill: ${skill.name}")
        return when (skill.risk) {
            "high" -> RiskAssessment.REJECTED // Simple rule for placeholder
            "medium" -> RiskAssessment.NEEDS_USER_CONFIRMATION
            else -> RiskAssessment.ALLOWED
        }
    }
}

enum class RiskAssessment {
    ALLOWED,
    NEEDS_USER_CONFIRMATION,
    REJECTED
}
