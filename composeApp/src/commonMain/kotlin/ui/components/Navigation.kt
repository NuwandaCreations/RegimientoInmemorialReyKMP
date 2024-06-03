package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import regimientoinmemorialrey.composeapp.generated.resources.Res
import regimientoinmemorialrey.composeapp.generated.resources.anthem
import regimientoinmemorialrey.composeapp.generated.resources.dailyOrder
import regimientoinmemorialrey.composeapp.generated.resources.duties
import regimientoinmemorialrey.composeapp.generated.resources.escudo_rinf1_antiguo
import regimientoinmemorialrey.composeapp.generated.resources.home
import regimientoinmemorialrey.composeapp.generated.resources.news
import regimientoinmemorialrey.composeapp.generated.resources.organization
import ui.HomeScreen
import ui.theme.LightColors

enum class Screens @OptIn(ExperimentalResourceApi::class) constructor(val title: StringResource) {
    @OptIn(ExperimentalResourceApi::class)
    Home(Res.string.home),

    @OptIn(ExperimentalResourceApi::class)
    DailyOrder(Res.string.dailyOrder),

    @OptIn(ExperimentalResourceApi::class)
    Organization(Res.string.organization),

    @OptIn(ExperimentalResourceApi::class)
    Anthem(Res.string.anthem),

    @OptIn(ExperimentalResourceApi::class)
    Duties(Res.string.duties),

    @OptIn(ExperimentalResourceApi::class)
    News(Res.string.news)
}


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Home.name
    ) {
        composable(route = Screens.Home.name) {
            HomeScreen()
            AppBar(navController, Screens.Home)
        }
        composable(route = Screens.DailyOrder.name) {
            screensBase(navController, Screens.DailyOrder)
        }
        composable(route = Screens.Organization.name) {
            screensBase(navController, Screens.Organization)
        }
        composable(route = Screens.Anthem.name) {
            screensBase(navController, Screens.Anthem)
        }
        composable(route = Screens.Duties.name) {
            screensBase(navController, Screens.Duties)
        }
        composable(route = Screens.News.name) {
            screensBase(navController, Screens.News)
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun screensBase(navController: NavController, screen: Screens) {
    Box(
        Modifier.fillMaxSize().background(color = LightColors.background),
        contentAlignment = Alignment.Center
    ) {
        Image(
            contentDescription = null,
            painter = painterResource(Res.drawable.escudo_rinf1_antiguo),
            modifier = Modifier.size(300.dp),
            alpha = 0.3f
        )
    }
    AppBar(navController, screen)
}