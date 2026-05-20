package com.ai.edge.pro.core

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ProSkillRegistry"

@Singleton
class SkillRegistry @Inject constructor() {

    private val skills = mutableMapOf<String, ProSkill>()

    fun loadSkills(context: Context) {
        val root = "skills" // Simplified for now, in assets or filesDir
        // In a real app, we'd list files in the skills directory
        Log.d(TAG, "Loading skills...")
    }

    fun registerSkill(skill: ProSkill) {
        skills[skill.name] = skill
    }

    fun findBestMatch(intent: String, context: Map<String, Any>): ProSkill? {
        // Simple trigger-based matching for now
        return skills.values.firstOrNull { skill ->
            skill.trigger.any { intent.contains(it, ignoreCase = true) }
        }
    }
}

data class ProSkill(
    val name: String,
    val model: String,
    val trigger: List<String>,
    val input: Map<String, String>,
    val steps: List<String>,
    val risk: String
)
