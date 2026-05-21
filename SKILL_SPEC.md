# Skill Specification Schema v1.0 🧩

All skills in Agent OS must follow this standardized JSON format.

## Schema Definition

```json
{
  "name": "string",
  "model": "Gemma4_E2B | FunctionGemma_270M_Mobile_Actions",
  "trigger": ["array", "of", "trigger", "phrases"],
  "input": {
    "param_name": "type_string"
  },
  "steps": ["array", "of", "internal", "action", "identifiers"],
  "risk": "low | medium | high"
}
```

## Field Details

- **name**: Unique identifier for the skill (e.g., `mobile.open_app`).
- **model**: The intelligence layer required. Use `Gemma4_E2B` for reasoning tasks and `FunctionGemma` for device actions.
- **trigger**: Phrases that the BrainEngine uses to route intent to this skill.
- **input**: Key-value pairs of expected parameters.
- **steps**: Internal execution flow logic.
- **risk**: Used by the Safety Guard to determine if user confirmation is required.

---

## Example: Toggle WiFi

```json
{
  "name": "system.toggle_wifi",
  "model": "FunctionGemma_270M_Mobile_Actions",
  "trigger": ["turn on wifi", "toggle wifi", "network switch"],
  "input": {},
  "risk": "medium",
  "steps": ["android_wifi_toggle"]
}
```
