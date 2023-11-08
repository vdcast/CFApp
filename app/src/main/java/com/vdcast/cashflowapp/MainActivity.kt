package com.vdcast.cashflowapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vdcast.cashflowapp.ui.theme.CashFlowAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CashFlowAppNewTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CashFlowAppUi()
                }
            }
        }
    }
}


@Composable
fun CashFlowAppNewTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
//            primary = Primary,
//            onPrimary = OnPrimary,
//            primaryContainer = PrimaryContainer,
//            onPrimaryContainer = OnPrimaryContainer,
//            secondary = Secondary,
//            onSecondary = OnSecondary,
//            secondaryContainer = SecondaryContainer,
//            onSecondaryContainer = OnSecondaryContainer,
//            tertiary = Tertiary,
//            onTertiary = OnTertiary,
//            tertiaryContainer = TertiaryContainer,
//            onTertiaryContainer = OnTertiaryContainer,
//            error = Error,
//            onError = OnError,
//            errorContainer = ErrorContainer,
//            onErrorContainer = OnErrorContainer,
//            background = Background,
//            onBackground = OnBackground,
//            surface = com.vdcast.velo_master_android.presentation.ui.theme.Surface,
//            onSurface = OnSurface,
//            outline = Outline,
//            surfaceVariant = SurfaceVariant,
//            onSurfaceVariant = OnSurfaceVariant


        ),
        shapes = MaterialTheme.shapes.copy(
            small = RoundedCornerShape(16.dp),
            medium = RoundedCornerShape(16.dp),
            large = RoundedCornerShape(16.dp)
        )
    ) {
        content()
    }
}