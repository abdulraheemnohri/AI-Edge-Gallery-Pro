package com.ai.edge.pro.skills

import com.ai.edge.pro.core.ProSkill
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SkillValidator @Inject constructor() {
    fun validate(skill: ProSkill): Boolean {
        return skill.name.isNotEmpty() && skill.steps.isNotEmpty()
    }
}
