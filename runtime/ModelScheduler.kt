package com.ai.edge.pro.runtime

import android.util.Log
import com.google.ai.edge.gallery.data.Model
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ModelScheduler @Inject constructor() {
    fun schedule(model: Model) {
        Log.d("ProModelScheduler", "Scheduling model for execution: ${model.name}")
    }
}
