package com.ai.edge.pro.runtime

import android.util.Log
import com.google.ai.edge.gallery.pro.core.ActionEngine
import com.google.ai.edge.gallery.pro.core.ProSkill
import com.google.ai.edge.gallery.pro.core.SkillRouter
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

private const val TAG = "ProSkillRuntime"

@Singleton
class SkillRuntime @Inject constructor(
    private val skillRouter: SkillRouter,
    private val actionEngine: ActionEngine,
    private val executionQueue: ExecutionQueue
) {
    private val scope = CoroutineScope(Dispatchers.Default)

    fun run(intent: String) {
        scope.launch {
            Log.d(TAG, "Starting runtime for intent: $intent")
            val skill = skillRouter.route(intent)
            if (skill != null) {
                executionQueue.enqueue(skill)
                processQueue()
            } else {
                Log.w(TAG, "No skill found for intent: $intent")
            }
        }
    }

    private suspend fun processQueue() {
        while (executionQueue.isNotEmpty()) {
            val skill = executionQueue.dequeue()
            Log.d(TAG, "Processing skill: ${skill?.name}")
            skill?.let {
                actionEngine.execute(it.name, emptyMap())
            }
        }
    }
}
