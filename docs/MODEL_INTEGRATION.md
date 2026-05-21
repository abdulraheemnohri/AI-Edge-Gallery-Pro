# Model Integration Guide 🤖

Agent OS leverages a dual-model architecture. This guide explains how to integrate and swap models in the Pro edition.

---

## 🧠 1. Reasoning Model (The Brain)

**Current Implementation**: Gemma 4 E2B (2B quantized)
**Integration Point**: `Gemma4Adapter.kt`

The Brain is responsible for:
- Mapping raw user text to `ReasoningPlan` objects.
- Selecting the appropriate skill from the `SkillRegistry`.

To swap the brain:
1. Update `Gemma4Adapter.kt` with the new model's inference logic.
2. Ensure the output format remains compatible with `SkillRouter`.

---

## ⚙️ 2. Execution Model (The Hands)

**Current Implementation**: FunctionGemma 270M
**Integration Point**: `FunctionGemmaAdapter.kt`

The Hands model is optimized for:
- Direct tool call generation.
- Mapping high-level steps into specific system intent calls.

---

## 🚀 3. Orchestration

The `ModelManager.kt` serves as the global orchestrator, managing the lifecycle and memory allocation for both models simultaneously.

```kotlin
modelManager.loadModels(brain = gemma4, hands = functionGemma)
```
