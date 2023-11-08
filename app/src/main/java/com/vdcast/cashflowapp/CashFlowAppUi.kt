package com.vdcast.cashflowapp

import android.app.Application
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vdcast.cashflowapp.domain.AppViewModel
import com.vdcast.cashflowapp.ui.game.GameHome
import com.vdcast.cashflowapp.ui.home.Home
import com.vdcast.cashflowapp.ui.navigation.Routes
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CashFlowApp : Application() {

}


@Composable
fun CashFlowAppUi(
    appViewModel: AppViewModel = hiltViewModel(),
    navController: NavHostController = rememberNavController()
) {

    NavHost(
        navController = navController,
        startDestination = Routes.Home.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None }
    ) {
        composable(Routes.Home.route) {
            Home(
                onButton1 = { navController.navigate(Routes.GameHome.route) }
            )
        }
        composable(Routes.GameHome.route) {
            GameHome(
                onBack = { navController.popBackStack() }
            )
        }
    }


}