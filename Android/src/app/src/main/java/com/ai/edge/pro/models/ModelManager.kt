package com.ai.edge.pro.models

import android.util.Log
import com.google.ai.edge.gallery.data.Model
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ProModelManager"

@Singleton
class ModelManager @Inject constructor() {

    private var activeBrainModel: Model? = null
    private var activeHandsModel: Model? = null

    fun loadModels(brain: Model, hands: Model) {
        Log.d(TAG, "Loading models: ${brain.name} and ${hands.name}")
        activeBrainModel = brain
        activeHandsModel = hands
    }

    fun getBrainModel(): Model? = activeBrainModel
    fun getHandsModel(): Model? = activeHandsModel
}
