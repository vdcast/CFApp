package com.vdcast.cashflowapp.ui.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun DreamList(
    selectedItem: String,
    onItemSelected: (selectedItem: String) -> Unit
) {
    var tempSelectedItem = selectedItem
    var expanded by rememberSaveable() { mutableStateOf(false) }

    val dreams = listOf(
        "- Choose from -", "African Photo Safari", "Ancient Asian Cities", "Be a \"Jet-Setter\"",
        "But a Forest", "Cannes Film Festival", "Capitalists' Peace Corps",
        "Cruise the Mediterranean on a Private Yacht", "Dinner with the President", "Gift of Faith",
        "Golf Around the World", "Heli-Ski the Swiss Alps", "Kid's Library", "Mini-Farm in the City",
        "Park Named After You", "Private Fishing Cabin on a Montana Lake", "Pro Team Box Seats",
        "Research Center for Cancer and AIDS", "Run for Mayor", "Save the Ocean Mammals",
        "Seven Wonders of the Worlds", "Southe Sea Island Fantasy", "Stock Market for Kids",
        "Yacht Racing"
    )

    if (selectedItem.isBlank() && dreams.isNotEmpty()) {
        onItemSelected(dreams[0])
        tempSelectedItem = dreams[0]
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
                dreams.forEach { profession ->
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