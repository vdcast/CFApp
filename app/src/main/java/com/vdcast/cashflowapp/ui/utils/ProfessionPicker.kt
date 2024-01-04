package com.vdcast.cashflowapp.ui.utils

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun ProfessionPicker(
    professions: List<String>,
    inputProfession: String,
    onProfessionSelected: (String) -> Unit
) {

    Column(
    ) {
        professions.forEach { profession ->
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .height(50.dp) // Висота кожного елемента списку
                    .background(if (inputProfession == profession) MaterialTheme.colorScheme.tertiaryContainer else MaterialTheme.colorScheme.background)
                    .clickable {
                        onProfessionSelected(if (profession == "-- Profession --") "" else profession)
                    }
            ) {
                Text(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(horizontal = 8.dp),
                    text = profession,
                )
            }
        }
    }
}