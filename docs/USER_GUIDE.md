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
- **Active Intelligence Core**: Status of the Brain (Reasoning) and Hands (Execution) layers.
- **Neural Health**: Real-time monitoring of inference latency and CPU/GPU load.
- **Autonomous Action Log**: A live history of skills triggered by the agent kernel.

### ⚙️ Skill Explorer
Browse the library of 100+ skills. You can:
- **Search**: Find specific automation capabilities (e.g., "WiFi", "Summarize").
- **Categories**: Filter skills by System, Mobile, AI, and more.
- **Enable/Disable**: Control which skills the agent is allowed to use.

---

## 💬 3. Using the AI Agent

### Chat + Action Mode
Enter the chat interface to interact with your agent.
1.  **Ask a Question**: "Find my schedule and plan my evening."
2.  **Reasoning Step (🧠)**: You will see the agent's internal "thinking" process as it uses Gemma 4 to analyze your intent.
3.  **Execution Step (⚙️)**: The agent will automatically call specific skills (e.g., `mobile.open_calendar`, `ai.plan_task`) to complete the request.
4.  **Confirmation**: For sensitive actions, the system will prompt you for final approval.

---

## 🔌 4. Advanced: Custom Skills

You can extend your agent by adding custom JSON skill definitions.
1.  Create a file named `myskill.json` following the standardized schema.
2.  Place it in the `skills/` directory.
3.  The agent kernel will automatically register the new capability on next boot.

---

## 🔐 5. Privacy & Safety
- **100% Offline**: All processing happens on your device. No data ever leaves your phone.
- **Audit Log**: Every skill execution is logged locally for your review.
- **Permission Control**: The agent only has access to the Android permissions you explicitly grant.
