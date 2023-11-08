package com.vdcast.cashflowapp.ui.navigation

sealed class Routes(val route: String) {
    object Home : Routes("Home")
    object GameHome : Routes("GameHome")
    object CalculatorHome : Routes("CalculatorHome")
}