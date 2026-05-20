package com.ai.edge.pro.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProChatScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Chat + Action Mode", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.weight(1f))
        // Chat interaction area
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Ask anything...") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}
