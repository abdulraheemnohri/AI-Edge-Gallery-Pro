package com.ai.edge.pro.core

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SafetyGuard @Inject constructor() {

    private var autonomousModeEnabled: Boolean = false

    fun setAutonomousMode(enabled: Boolean) {
        this.autonomousModeEnabled = enabled
    }

    fun checkRisk(skill: ProSkill): RiskAssessment {
        Log.d("ProSafetyGuard", "Checking risk for skill: ${skill.name} (AutoMode: $autonomousModeEnabled)")

        if (autonomousModeEnabled && skill.risk != "high") {
            return RiskAssessment.ALLOWED
        }

        return when (skill.risk) {
            "high" -> RiskAssessment.NEEDS_USER_CONFIRMATION
            "medium" -> if (autonomousModeEnabled) RiskAssessment.ALLOWED else RiskAssessment.NEEDS_USER_CONFIRMATION
            else -> RiskAssessment.ALLOWED
        }
    }
}

enum class RiskAssessment {
    ALLOWED,
    NEEDS_USER_CONFIRMATION,
    REJECTED
}
