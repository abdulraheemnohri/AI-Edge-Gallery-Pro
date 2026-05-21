package com.ai.edge.pro.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ModelBenchScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Neural Benchmarks", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(24.dp))

        BenchmarkResult(name = "Reasoning Latency (Gemma 4)", result = "120ms")
        BenchmarkResult(name = "Execution Latency (FG 270M)", result = "45ms")
        BenchmarkResult(name = "Memory Throughput", result = "4.2 GB/s")
    }
}

@Composable
fun BenchmarkResult(name: String, result: String) {
    Card(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)) {
        Row(modifier = Modifier.padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(name, style = MaterialTheme.typography.bodyMedium)
            Text(result, style = MaterialTheme.typography.titleSmall, color = MaterialTheme.colorScheme.primary)
        }
    }
}
