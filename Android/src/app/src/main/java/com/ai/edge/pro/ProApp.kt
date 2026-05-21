package com.ai.edge.pro

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.ai.edge.pro.ui.AgentDashboard
import com.ai.edge.pro.ui.ProChatScreen
import com.ai.edge.pro.ui.SkillExplorerScreen
import com.ai.edge.pro.ui.SettingsScreen

@Composable
fun ProApp() {
    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Icon(Icons.Default.Dashboard, contentDescription = null) },
                    label = { Text("Dashboard") }
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Icon(Icons.Default.Explore, contentDescription = null) },
                    label = { Text("Skills") }
                )
                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    icon = { Icon(Icons.Default.Chat, contentDescription = null) },
                    label = { Text("Chat") }
                )
                NavigationBarItem(
                    selected = selectedTab == 3,
                    onClick = { selectedTab = 3 },
                    icon = { Icon(Icons.Default.Settings, contentDescription = null) },
                    label = { Text("Settings") }
                )
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (selectedTab) {
                0 -> AgentDashboard()
                1 -> SkillExplorerScreen()
                2 -> ProChatScreen()
                3 -> SettingsScreen()
            }
        }
    }
}
