# AI Edge Gallery Pro — User Guide 📖

Welcome to the **AI Edge Gallery Pro (Agent OS Edition)**. This guide will help you set up and master your on-device AI Agent Operating System.

---

## 🛠️ 1. Initial Setup

### Download & Installation
1.  Navigate to the [GitHub Actions](https://github.com/google-ai-edge/gallery/actions) tab.
2.  Select the latest successful build of the **Build Android APK** workflow.
3.  Download the `app-debug` artifact, unzip it, and install the APK on your Android device (Android 12+ required).

### Model Configuration
Agent OS requires two primary models to function:
- **Gemma 4 E2B**: Go to the **Model Manager** and download the Gemma 4 variant. This is your "Reasoning" engine.
- **FunctionGemma 270M**: Download the FunctionGemma model. This is your "Execution" engine.

---

## 🖥️ 2. Navigating the Interface

### 🧠 Agent Dashboard
The Dashboard is your home screen. It shows:
- **System Health**: CPU/GPU utilization for AI tasks.
- **Active Tasks**: Real-time status of any ongoing autonomous operations.
- **Memory Stats**: Current context window usage.

### ⚙️ Skill Explorer
Browse the library of 100+ skills. You can:
- **Search**: Find specific automation capabilities (e.g., "WiFi", "Summarize").
- **Enable/Disable**: Toggle skills on or off to customize your agent's abilities.
- **View Risk**: See the risk assessment level (Low/Medium/High) for each skill.

---

## 💬 3. Using the AI Agent

### Chat + Action Mode
Enter the chat interface to interact with your agent.
1.  **Ask a Question**: "Plan a trip and set reminders."
2.  **Reasoning Step**: You will see the agent's internal "thinking" process as it uses Gemma 4 to break down the task.
3.  **Execution Step**: The agent will automatically call skills (e.g., `ai.plan_task`, `mobile.set_alarm`) to complete the request.
4.  **Confirmation**: For high-risk actions (like sending a message), the **Safety Guard** will ask for your approval.

---

## 🔌 4. Advanced: Custom Skills

You can extend your agent by adding custom JSON skill definitions.
1.  Create a file named `myskill.json` following the [Skill Specification](../SKILL_SPEC.md).
2.  Place it in the `skills/` directory.
3.  Reboot the app to register the new capability.

---

## 🔐 5. Privacy & Safety
- **100% Offline**: All processing happens on your device. No data ever leaves your phone.
- **Audit Log**: Every skill execution is logged locally for your review.
- **Permission Control**: The agent only has access to the Android permissions you explicitly grant.

---

## 🆘 Troubleshooting
- **Slow Performance**: Ensure you have at least 8GB of RAM for Gemma 4 reasoning.
- **Skill Failure**: Check if the required Android permission (e.g., Calendar, Location) is enabled in your phone settings.
