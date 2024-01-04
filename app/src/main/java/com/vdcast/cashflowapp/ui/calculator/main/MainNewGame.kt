package com.vdcast.cashflowapp.ui.calculator.main

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vdcast.cashflowapp.R
import com.vdcast.cashflowapp.domain.AppViewModel
import com.vdcast.cashflowapp.ui.utils.DreamList
import com.vdcast.cashflowapp.ui.utils.ProfessionPicker
import com.vdcast.cashflowapp.ui.utils.ProfessionsList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainNewGame(
    appViewModel: AppViewModel,
    onClose: () -> Unit,
    onStart: () -> Unit,
) {
    var inputProfession by remember { mutableStateOf("") }
    var inputDream by remember { mutableStateOf("") }
    var inputAuditor by remember { mutableStateOf("") }
    val scrollState = rememberScrollState()


//    var isProfessionsVisible by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(0.5f),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .aspectRatio(358f / 110f),
                painter = painterResource(id = R.mipmap.header_income),
                contentDescription = "header_income"
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier.widthIn(min = 80.dp),
                onClick = { onClose() },
                contentPadding = PaddingValues(all = 2.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Cancel",
                    style = MaterialTheme.typography.bodySmall,
                )
            }
            Text(
                text = "New Game",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Button(
                modifier = Modifier.widthIn(min = 80.dp),
                onClick = { onStart() },
                contentPadding = PaddingValues(all = 2.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Start",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = 8.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primaryContainer)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = 16.dp,
                            vertical = 16.dp
                        )
                        .background(MaterialTheme.colorScheme.primaryContainer)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(
                                    bottom = 4.dp,
                                    start = 16.dp
                                ),
                            text = "Profession",
                            color = MaterialTheme.colorScheme.secondary,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        ProfessionsList(
                            selectedItem = inputProfession
                        ) {
                            inputProfession = it
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(
                                    bottom = 4.dp,
                                    start = 16.dp
                                ),
                            text = "Dream",
                            color = MaterialTheme.colorScheme.secondary,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        DreamList(
                            selectedItem = inputDream
                        ) {
                            inputDream = it
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.Start,
                    ) {

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text(
                                modifier = Modifier
                                    .padding(
                                        bottom = 4.dp,
                                        start = 16.dp
                                    ),
                                text = "Auditor - Person to the right",
                                color = MaterialTheme.colorScheme.secondary,
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }
                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = inputAuditor,
                            onValueChange = { newValue ->
                                inputAuditor = newValue
                            },
                            label = { Text(text = "Auditor's name") }
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(
                            onClick = { onStart() },
                            modifier = Modifier.fillMaxWidth(0.55f),
                        ) {
                            Text(
                                text = "Start",
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
    BackHandler {
        onClose()
    }
}