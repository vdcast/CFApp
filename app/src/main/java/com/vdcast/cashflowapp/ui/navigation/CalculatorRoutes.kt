package com.vdcast.cashflowapp.ui.navigation

sealed class CalculatorRoutes(val route: String) {
    object MainHelp : CalculatorRoutes("MainHelp")
    object MainNewGame : CalculatorRoutes("MainNewGame")
}