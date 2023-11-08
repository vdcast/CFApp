package com.vdcast.cashflowapp.ui.navigation

import com.vdcast.cashflowapp.R

sealed class CalculatorBottomItem(val title: String, val iconId: Int, val route: String){
    object Main: CalculatorBottomItem("Main", R.mipmap.icon_bottom_menu_main_selected, "Main")
    object Income: CalculatorBottomItem("Income", R.mipmap.icon_bottom_menu_income_unselected, "Income")
    object Expenses: CalculatorBottomItem("Expenses", R.mipmap.icon_bottom_menu_expenses_unselected, "Expenses")
    object Assets: CalculatorBottomItem("Assets", R.mipmap.icon_vottom_menu_assets_unselected, "Assets")
    object Liabilities: CalculatorBottomItem("Liabilities", R.mipmap.icon_bottom_menu_liabilities_unselected, "Liabilities")
}