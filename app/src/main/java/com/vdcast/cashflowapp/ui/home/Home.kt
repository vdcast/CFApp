package com.vdcast.cashflowapp.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Home(
    onButton1: () -> Unit,
    onButton2: () -> Unit,
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "CashoFlow UA",
            style = MaterialTheme.typography.headlineSmall
        )
        Button(onClick = { onButton1() }) {
            Text(text = "Let's go!")
        }
        Button(onClick = { onButton2() }) {
            Text(text = "Calculator")
        }
    }
}