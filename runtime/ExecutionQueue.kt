package com.ai.edge.pro.runtime

import com.google.ai.edge.gallery.pro.core.ProSkill
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExecutionQueue @Inject constructor() {
    private val queue: Queue<ProSkill> = LinkedList()

    fun enqueue(skill: ProSkill) {
        queue.add(skill)
    }

    fun dequeue(): ProSkill? {
        return queue.poll()
    }

    fun isNotEmpty(): Boolean {
        return queue.isNotEmpty()
    }
}
