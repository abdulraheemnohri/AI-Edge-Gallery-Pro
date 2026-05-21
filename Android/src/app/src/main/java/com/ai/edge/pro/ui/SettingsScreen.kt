package com.ai.edge.pro.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Pro Settings", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(24.dp))

        ToggleSetting(title = "Autonomous Mode", description = "Allow AI to execute skill chains without confirmation")
        ToggleSetting(title = "Thinking Mode", description = "Visualize reasoning steps in chat")
        ToggleSetting(title = "Privacy Mode", description = "Restrict all data to local sandbox")
    }
}

@Composable
fun ToggleSetting(title: String, description: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp)) {
        Column(modifier = Modifier.weight(1f)) {
            Text(title, style = MaterialTheme.typography.titleMedium)
            Text(description, style = MaterialTheme.typography.bodySmall)
        }
        Switch(checked = true, onCheckedChange = {})
    }
}
