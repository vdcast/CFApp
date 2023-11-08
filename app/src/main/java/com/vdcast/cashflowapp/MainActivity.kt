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
import com.vdcast.cashflowapp.ui.theme.Background
import com.vdcast.cashflowapp.ui.theme.CashFlowAppTheme
import com.vdcast.cashflowapp.ui.theme.Error
import com.vdcast.cashflowapp.ui.theme.ErrorContainer
import com.vdcast.cashflowapp.ui.theme.OnBackground
import com.vdcast.cashflowapp.ui.theme.OnError
import com.vdcast.cashflowapp.ui.theme.OnErrorContainer
import com.vdcast.cashflowapp.ui.theme.OnPrimary
import com.vdcast.cashflowapp.ui.theme.OnPrimaryContainer
import com.vdcast.cashflowapp.ui.theme.OnSecondary
import com.vdcast.cashflowapp.ui.theme.OnSecondaryContainer
import com.vdcast.cashflowapp.ui.theme.OnSurface
import com.vdcast.cashflowapp.ui.theme.OnSurfaceVariant
import com.vdcast.cashflowapp.ui.theme.OnTertiary
import com.vdcast.cashflowapp.ui.theme.OnTertiaryContainer
import com.vdcast.cashflowapp.ui.theme.Outline
import com.vdcast.cashflowapp.ui.theme.Primary
import com.vdcast.cashflowapp.ui.theme.PrimaryContainer
import com.vdcast.cashflowapp.ui.theme.Secondary
import com.vdcast.cashflowapp.ui.theme.SecondaryContainer
import com.vdcast.cashflowapp.ui.theme.SurfaceVariant
import com.vdcast.cashflowapp.ui.theme.Tertiary
import com.vdcast.cashflowapp.ui.theme.TertiaryContainer
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
            primary = Primary,
            onPrimary = OnPrimary,
            primaryContainer = PrimaryContainer,
            onPrimaryContainer = OnPrimaryContainer,
            secondary = Secondary,
            onSecondary = OnSecondary,
            secondaryContainer = SecondaryContainer,
            onSecondaryContainer = OnSecondaryContainer,
            tertiary = Tertiary,
            onTertiary = OnTertiary,
            tertiaryContainer = TertiaryContainer,
            onTertiaryContainer = OnTertiaryContainer,
            error = Error,
            onError = OnError,
            errorContainer = ErrorContainer,
            onErrorContainer = OnErrorContainer,
            background = Background,
            onBackground = OnBackground,
            surface = SurfaceVariant,
            onSurface = OnSurface,
            outline = Outline,
            surfaceVariant = SurfaceVariant,
            onSurfaceVariant = OnSurfaceVariant


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