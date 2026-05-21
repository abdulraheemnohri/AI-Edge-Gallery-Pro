# AI Edge Gallery Pro (Agent OS Edition) 🧠⚙️

[![Build Android APK](https://github.com/google-ai-edge/gallery/actions/workflows/build_android.yaml/badge.svg)](https://github.com/google-ai-edge/gallery/actions/workflows/build_android.yaml)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)

**The first Offline AI Agent Operating System for Android.**

AI Edge Gallery Pro transforms your mobile device into an autonomous AI workstation. Powered by a "Dual Brain" architecture, it separates high-order reasoning from device execution, allowing you to run complex, multi-step agentic tasks fully offline with 100% privacy.

---

## 🚀 The Dual Brain Architecture

AI Edge Gallery Pro utilizes two distinct model layers to mimic human-like intelligence:

1.  🧠 **The Brain (Gemma 4 E2B):** Responsible for reasoning, planning, intent analysis, and long-term memory. It breaks down complex user requests into executable steps.
2.  ⚙️ **The Hands (FunctionGemma 270M):** A high-performance execution layer fine-tuned for Android system actions, intent handling, and device automation.

---

## ✨ Pro Features

*   🧠 **Agent Dashboard**: A central command center to monitor system health, active agent tasks, and memory usage.
*   🧩 **100+ Unified Skills**: A massive library of standardized skills across System, Mobile, AI, Edge, and Developer categories.
*   🛰️ **Autonomous Mode**: The AI agent can plan and execute multi-turn sequences without constant user intervention.
*   🔐 **Safety Guard**: Real-time risk assessment for every autonomous action, ensuring high-risk tasks require user confirmation.
*   💾 **Context Memory**: A sophisticated memory system that tracks user habits and session history to improve task suggestions over time.
*   🔌 **Dynamic Plugin System**: Load new skills from JSON definitions or import community-driven automation packs.

---

## 🛠️ Technology Stack

*   **Google AI Edge / LiteRT**: Core runtime for high-performance on-device inference.
*   **Gemma 4 Family**: Leading open-weights models for reasoning and thinking.
*   **FunctionGemma**: Specialized fine-tunes for tool use and function calling.
*   **Jetpack Compose**: Modern, fluid UI with a high-end "Aetheris" glassmorphism design system.

---

## 🏁 Get Started

1.  **Download the Pro APK**: Grab the latest build from the [GitHub Actions Artifacts](https://github.com/google-ai-edge/gallery/actions).
2.  **Initialize Models**: Download the Gemma 4 and FunctionGemma model weights via the in-app Model Manager.
3.  **Explore Skills**: Open the **Skill Explorer** to browse and enable the 100+ built-in automation capabilities.
4.  **Read the [User Guide](docs/USER_GUIDE.md)** for deep-dive instructions on configuring your Agent OS.

---

## 📖 Documentation

*   [User Guide](docs/USER_GUIDE.md) - How to use Agent OS.
*   [Architecture](docs/ARCHITECTURE.md) - Deep dive into the Dual Brain kernel.
*   [Skills Guide](docs/SKILLS_GUIDE.md) - How to create and import custom skills.

---

## 🤝 Contributing

We welcome community skills and feature requests! Check out our [Skill Specification](SKILL_SPEC.md) to start building.

## 📄 License

Licensed under the Apache License, Version 2.0. See [LICENSE](LICENSE) for details.
