package com.ai.edge.pro.core

import android.content.Context
import android.util.Log
import com.ai.edge.pro.skills.SkillLoader
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ProSkillRegistry"

@Singleton
class SkillRegistry @Inject constructor(
    private val loader: SkillLoader
) {

    private val skills = mutableMapOf<String, ProSkill>()

    fun initialize() {
        Log.d(TAG, "Initializing Skill Registry...")
        val loadedSkills = loader.loadAllSkills()
        loadedSkills.forEach { registerSkill(it) }
        Log.d(TAG, "Registered ${skills.size} skills")
    }

    fun registerSkill(skill: ProSkill) {
        skills[skill.name] = skill
    }

    fun findBestMatch(intent: String, context: Map<String, Any>): ProSkill? {
        return skills.values.firstOrNull { skill ->
            skill.trigger.any { intent.contains(it, ignoreCase = true) }
        }
    }

    fun getAllSkills(): List<ProSkill> = skills.values.toList()
}

data class ProSkill(
    val name: String,
    val model: String,
    val trigger: List<String>,
    val input: Map<String, String>,
    val steps: List<String>,
    val risk: String
)
