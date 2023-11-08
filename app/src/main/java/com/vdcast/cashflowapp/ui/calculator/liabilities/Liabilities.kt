package com.vdcast.cashflowapp.ui.calculator.liabilities

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.vdcast.cashflowapp.domain.AppViewModel

@Composable
fun Liabilities(
    appViewModel: AppViewModel,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Liabilities",
            style = MaterialTheme.typography.headlineSmall
        )
        Button(onClick = { Log.d("MYLOG" , "Button1") }) {
            Text(text = "Button1")
        }
    }
}