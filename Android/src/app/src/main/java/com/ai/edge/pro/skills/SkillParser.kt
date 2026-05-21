package com.ai.edge.pro.skills

import com.ai.edge.pro.core.ProSkill
import com.google.gson.Gson
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SkillParser @Inject constructor() {
    private val gson = Gson()

    fun parse(json: String): ProSkill {
        return gson.fromJson(json, ProSkill::class.java)
    }
}
