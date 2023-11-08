package com.vdcast.cashflowapp.ui.calculator

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.vdcast.cashflowapp.domain.AppViewModel
import com.vdcast.cashflowapp.ui.calculator.assets.Assets
import com.vdcast.cashflowapp.ui.calculator.expenses.Expenses
import com.vdcast.cashflowapp.ui.calculator.income.Income
import com.vdcast.cashflowapp.ui.calculator.liabilities.Liabilities
import com.vdcast.cashflowapp.ui.calculator.main.Main
import com.vdcast.cashflowapp.ui.calculator.main.MainHelp
import com.vdcast.cashflowapp.ui.calculator.main.MainNewGame
import com.vdcast.cashflowapp.ui.navigation.CalculatorBottomItem
import com.vdcast.cashflowapp.ui.navigation.CalculatorRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorHome(
    navController: NavHostController,
    appViewModel: AppViewModel,
    onBack: () -> Unit,
) {

    val currentScreen = remember { mutableStateOf(CalculatorBottomItem.Main.route) }

    Scaffold(
        bottomBar = {
            BottomAppBar(
//                modifier = Modifier.background(Green10)
            ) {
                val backStackEntry by navController.currentBackStackEntryAsState()
//                val currentRoute = backStackEntry?.destination?.route

                val listOfScreenItems = listOf(
                    CalculatorBottomItem.Main,
                    CalculatorBottomItem.Income,
                    CalculatorBottomItem.Expenses,
                    CalculatorBottomItem.Assets,
                    CalculatorBottomItem.Liabilities,
                )

                listOfScreenItems.forEach { item ->
                    val selected = currentScreen.value == item.route
                    val tint = animateColorAsState(
                        targetValue = if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
                        animationSpec = tween(300),
                        label = ""
                    )
                    NavigationBarItem(
                        selected = currentScreen.value == item.route,
                        onClick = {
                            if (currentScreen.value != item.route) {
                                currentScreen.value = item.route
                            }
                        },
                        icon = {
                            Icon(
                                modifier = Modifier
                                    .size(24.dp),
                                painter = painterResource(id = item.iconId),
                                contentDescription = "icon of selected",
                                tint = tint.value
                            )
                        },
                        label = {
                            Text(
                                text = item.title,
                                fontSize = 9.sp,
                                color = tint.value
                            )
                        },
                    )
                }
            }
        }
    ) { innerPadding ->


        Column(
            modifier = Modifier.padding(innerPadding)
        ) {

            when (currentScreen.value) {

                CalculatorBottomItem.Income.route -> Income(
                    appViewModel = appViewModel
                )

                CalculatorBottomItem.Expenses.route -> Expenses(
                    appViewModel = appViewModel
                )

                CalculatorBottomItem.Assets.route -> Assets(
                    appViewModel = appViewModel
                )

                CalculatorBottomItem.Liabilities.route -> Liabilities(
                    appViewModel = appViewModel
                )

                CalculatorRoutes.MainHelp.route -> MainHelp(
                    appViewModel = appViewModel,
                    onBack = { currentScreen.value = CalculatorBottomItem.Main.route }
                )

                CalculatorRoutes.MainNewGame.route -> MainNewGame(
                    appViewModel = appViewModel,
                    onBack = { currentScreen.value = CalculatorBottomItem.Main.route }
                )
                // CalculatorBottomItem.Main.route ->
                else -> Main(
                    appViewModel = appViewModel,
                    onHelp = { currentScreen.value = CalculatorRoutes.MainHelp.route },
                    onNewGame = { currentScreen.value = CalculatorRoutes.MainNewGame.route },
                )
            }
        }
    }
}