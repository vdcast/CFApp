package com.vdcast.cashflowapp.ui.calculator.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vdcast.cashflowapp.R
import com.vdcast.cashflowapp.domain.AppViewModel
import com.vdcast.cashflowapp.ui.theme.Orange10
import com.vdcast.cashflowapp.ui.theme.Pink10

@Composable
fun Main(
    appViewModel: AppViewModel,
    onHelp: () -> Unit,
    onNewGame: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier.widthIn(min = 80.dp),
                onClick = { onHelp() },
                contentPadding = PaddingValues(all = 2.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Help",
                    style = MaterialTheme.typography.bodySmall,
                )
            }
            Button(
                modifier = Modifier.widthIn(min = 80.dp),
                onClick = { onNewGame() },
                contentPadding = PaddingValues(all = 2.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "New Game",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .aspectRatio(700f / 144f)
                    .padding(horizontal = 8.dp),
                painter = painterResource(id = R.mipmap.main_header_image),
                contentDescription = "main_header_image"
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Engineer",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Orange10)
                .padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Image(
                modifier = Modifier
                    .aspectRatio(261f / 113f)
                    .weight(1f),
                painter = painterResource(id = R.mipmap.button_buy_calc_home),
                contentDescription = "button_buy_calc_home"
            )
            Image(
                modifier = Modifier
                    .aspectRatio(261f / 113f)
                    .weight(1f),
                painter = painterResource(id = R.mipmap.button_sell_calc_home),
                contentDescription = "button_sell_calc_home"
            )
            Image(
                modifier = Modifier
                    .aspectRatio(261f / 113f)
                    .weight(1f),
                painter = painterResource(id = R.mipmap.button_loan_calc_home),
                contentDescription = "button_loan_calc_home"
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Pink10)
                .padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Image(
                modifier = Modifier
                    .aspectRatio(264f / 80f)
                    .weight(1f),
                painter = painterResource(id = R.mipmap.buttom_market_action_calc_home),
                contentDescription = "buttom_market_action_calc_home"
            )
            Image(
                modifier = Modifier
                    .aspectRatio(264f / 79f)
                    .weight(1f),
                painter = painterResource(id = R.mipmap.button_pay_calc_home),
                contentDescription = "button_pay_calc_home"
            )
            Image(
                modifier = Modifier
                    .aspectRatio(265f / 81f)
                    .weight(1f),
                painter = painterResource(id = R.mipmap.button_collect_calc_home),
                contentDescription = "button_collect_calc_home"
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 16.dp,
                    vertical = 16.dp
                ),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cash on Hand",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Row {
                    Text(
                        text = "114 048 UAH",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "KeyboardArrowRight"
                    )
                }
            }
            Divider(
                modifier = Modifier.padding(vertical = 8.dp),
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
//                    modifier = Modifier
//                        .size(124.dp, 34.dp),
                    painter = painterResource(id = R.mipmap.cashflow_calc_home),
                    contentDescription = "cashflow_calc_home"
                )
                Row {
                    Text(
                        text = "2 860 UAH",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(24.dp))
                }
            }
            Divider(
                modifier = Modifier.padding(vertical = 8.dp),
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.mipmap.expenses_calc_home),
                    contentDescription = "expenses_calc_home"
                )
                Row {
                    Text(
                        text = "3 710 UAH",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(24.dp))
                }
            }
            Divider(
                modifier = Modifier.padding(vertical = 8.dp),
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Total Income",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Row {
                    Text(
                        text = "7 760 UAH",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(24.dp))
                }
            }
            Divider(
                modifier = Modifier.padding(vertical = 8.dp),
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "PAYDAY",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Row {
                    Text(
                        text = "4 050 UAH",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(24.dp))
                }
            }
            Divider(
                modifier = Modifier.padding(vertical = 8.dp),
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
//            Divider()
        }

    }
}