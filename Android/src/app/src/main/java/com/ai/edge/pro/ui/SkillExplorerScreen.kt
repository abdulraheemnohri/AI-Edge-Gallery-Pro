package com.ai.edge.pro.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SkillExplorerScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Skill Explorer", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            // Placeholder for 100+ skills list
            items(10) { index ->
                SkillItem(name = "Skill ${index + 1}")
            }
        }
    }
}

@Composable
fun SkillItem(name: String) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Text(name, modifier = Modifier.padding(16.dp))
    }
}
