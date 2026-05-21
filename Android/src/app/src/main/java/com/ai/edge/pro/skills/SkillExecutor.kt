package com.ai.edge.pro.skills

import com.ai.edge.pro.core.ActionEngine
import com.ai.edge.pro.core.ProSkill
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SkillExecutor @Inject constructor(
    private val actionEngine: ActionEngine
) {
    fun executeSkill(skill: ProSkill, input: Map<String, Any>) {
        actionEngine.execute(skill.name, input)
    }
}
