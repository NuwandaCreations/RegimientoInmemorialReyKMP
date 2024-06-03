package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import regimientoinmemorialrey.composeapp.generated.resources.Res
import regimientoinmemorialrey.composeapp.generated.resources.escudo_rinf1_antiguo
import regimientoinmemorialrey.composeapp.generated.resources.motto_head
import regimientoinmemorialrey.composeapp.generated.resources.motto_response
import ui.components.Spacer
import ui.theme.LightColors

@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.background(
            LightColors.background
        ).fillMaxSize()
    ) {
        Text(
            text = stringResource(Res.string.motto_head),
            color = Color.White,
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
        Spacer(70)
        Image(
            painter = painterResource(Res.drawable.escudo_rinf1_antiguo),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )
        Spacer(70)
        Text(
            text = stringResource(Res.string.motto_response),
            color = Color.White,
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}