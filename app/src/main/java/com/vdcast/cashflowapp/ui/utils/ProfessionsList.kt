package com.vdcast.cashflowapp.ui.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun ProfessionsList(
    selectedItem: String,
    onItemSelected: (selectedItem: String) -> Unit
) {
    var tempSelectedItem = selectedItem
    var expanded by rememberSaveable() { mutableStateOf(false) }

    val professions = listOf(
        "- Choose from -", "Airline Pilot", "Business Manager", "Doctor (MD)", "Engineer",
        "Janior", "Lawyer", "Mechanic", "Nurse", "Police Officer", "Secretary", "Teacher (K-12)",
        "Truck Driver"
    )

    if (selectedItem.isBlank() && professions.isNotEmpty()) {
        onItemSelected(professions[0])
        tempSelectedItem = professions[0]
    }


    OutlinedButton(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = { expanded = true },
//        enabled = professions.isNotEmpty(),
        shape = RoundedCornerShape(8.dp),
    ) {
        Text(
            text = tempSelectedItem,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
//            modifier = Modifier.weight(1f)
        )

        Icon(if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown, contentDescription = null)

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
//                .fillMaxWidth(0.5f)
                .heightIn(max = 240.dp)
        ) {
            Column(
                modifier = Modifier
//                    .verticalScroll(scrollState)
            ) {
                professions.forEach { profession ->
                    DropdownMenuItem(
                        text = { Text(text = profession) },
                        onClick = {
                            expanded = false
                            onItemSelected(profession)
                        }
                    )
                }
            }
        }
    }

}