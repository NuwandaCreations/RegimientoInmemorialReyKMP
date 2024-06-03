package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Screens(val title: String) {
    Home("Home"),
    DailyOrder("Daily Order"),
    PdfViewer("Pdf Viewer"),
    News("News")
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Home.name
    ) {
        composable(route = Screens.Home.name) {
            Box {
                Button(
                    content = { Text("PdfViewer screen") },
                    onClick = {
                        navController.navigate(Screens.PdfViewer.name)
                    }
                )
            }
        }
        composable(route = Screens.PdfViewer.name) {
            Box(modifier = Modifier.background(Color.Cyan).fillMaxSize()) {  }
        }
    }
}