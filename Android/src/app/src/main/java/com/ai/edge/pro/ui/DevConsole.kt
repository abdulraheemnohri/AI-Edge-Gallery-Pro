package com.ai.edge.pro.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DevConsole() {
    Column(modifier = Modifier.fillMaxSize().background(Color.Black).padding(16.dp)) {
        Text("Agent OS Debug Console", color = Color.Green, style = MaterialTheme.typography.titleSmall)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(modifier = Modifier.weight(1f)) {
            items(20) { i ->
                Text(
                    "[DEBUG] system.kernel: step_$i completed successfully (latency: 12ms)",
                    color = Color.Green,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }

        Text("> _", color = Color.Green, style = MaterialTheme.typography.bodyMedium)
    }
}
