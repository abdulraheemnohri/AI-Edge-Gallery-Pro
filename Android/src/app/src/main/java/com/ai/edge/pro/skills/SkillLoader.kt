package com.ai.edge.pro.skills

import android.content.Context
import android.util.Log
import com.ai.edge.pro.core.ProSkill
import com.google.gson.Gson
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.InputStreamReader
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SkillLoader @Inject constructor(
    @ApplicationContext private val context: Context,
    private val parser: SkillParser
) {
    fun loadAllSkills(): List<ProSkill> {
        val skills = mutableListOf<ProSkill>()
        // Logic to list and load JSON files from assets/skills
        Log.d("ProSkillLoader", "Scanning for skills...")
        return skills
    }
}
