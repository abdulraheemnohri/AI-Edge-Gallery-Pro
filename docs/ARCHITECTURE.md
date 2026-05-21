# AI Edge Gallery Pro — Architecture 🏗️

This document details the "Dual Brain" kernel architecture of the **AI Edge Gallery Pro (Agent OS Edition)**.

---

## 🏗️ 1. System Overview

Agent OS is designed to bridge the gap between high-level reasoning and low-level device control. It uses a split-intelligence model to ensure safety, performance, and offline autonomy.

```text
User Intent -> [BrainEngine] -> [SkillRouter] -> [ExecutionQueue] -> [ActionEngine] -> Device
```

---

## 🧠 2. The Brain (Reasoning Layer)

**Model:** Gemma 4 E2B (2B variant)
**Responsibility:**
- Intent Parsing: Understanding natural language requests.
- Planning: Breaking down complex goals into discrete atomic steps.
- Skill Selection: Identifying which tools/skills from the registry are needed.
- Memory: Maintaining conversation context and user habit history.

---

## ⚙️ 3. The Hands (Execution Layer)

**Model:** FunctionGemma (270M variant)
**Responsibility:**
- Tool Execution: Calling specific Android intents and system APIs.
- Logic Sequence: Executing the steps provided by the BrainEngine.
- System Feedback: Returning the results of actions back to the reasoning layer.

---

## 🧩 4. Skill System

Skills are defined in a standardized JSON schema. Each skill contains:
- **Trigger**: Natural language keywords that activate the skill.
- **Input Schema**: Parameters required for execution.
- **Steps**: The sequence of internal actions to be taken.
- **Risk Level**: Scoring (Low, Medium, High) used by the Safety Guard.

---

## 🔐 5. Safety & Security

### Safety Guard
- Intercepts all high-risk execution requests.
- Requires explicit user biometric/UI confirmation before performing sensitive actions (e.g., sending data, deleting files).

### Privacy Kernel
- 100% On-Device: No cloud API calls for inference.
- Local Storage: Memory and history are encrypted in the app's private sandbox.

---

## 🚀 6. Execution Pipeline

1.  **Ingestion**: User commands via Chat or Voice.
2.  **Routing**: `SkillRouter` uses Brain reasoning to find a matching skill in the `SkillRegistry`.
3.  **Queuing**: Tasks are added to the `ExecutionQueue` for asynchronous processing.
4.  **Action**: `ActionEngine` invokes the `DeviceController` to interact with Android System services.
