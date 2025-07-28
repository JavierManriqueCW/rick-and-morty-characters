package com.jmp.rickandmortycharacters.main.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jmp.rickandmortycharacters.common.navigation.ArgumentKeys
import com.jmp.rickandmortycharacters.common.navigation.Screen
import com.jmp.rickandmortycharacters.detail.view.DetailScreen
import com.jmp.rickandmortycharacters.list.view.ListScreen
import com.jmp.rickandmortycharacters.main.viewmodel.MainViewModel
import com.jmp.rickandmortycharacters.onboarding.OnboardingCarousel
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MainScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                viewModel = koinViewModel()
            )
        }
    }

    @Composable
    fun MainScreen(
        modifier: Modifier,
        viewModel: MainViewModel
    ) {
        val navigationController = rememberNavController()

        NavHost(
            navController = navigationController,
            startDestination = viewModel.getStartDestinationScreen(),
        ) {
            composable(Screen.Onboarding.route) {
                OnboardingCarousel(
                    modifier = modifier,
                    onOnboardingFinished = {
                        viewModel.disableShouldShowOnboarding()
                        navigationController.navigate(Screen.Characters.route) {
                            popUpTo(Screen.Onboarding.route) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    }
                )
            }
            composable(Screen.Characters.route) {
                ListScreen(
                    modifier = modifier,
                    navigationController = navigationController,
                    viewModel = koinViewModel()
                )
            }
            composable(
                route = Screen.CharacterDetail.route,
                arguments = Screen.CharacterDetail.arguments
            ) { backStackEntry ->
                DetailScreen(
                    modifier = modifier,
                    navigationController = navigationController,
                    viewModel = koinViewModel(),
                    characterId = requireNotNull(backStackEntry.arguments?.getLong(ArgumentKeys.CHARACTER_ID_ARGUMENT_KEY))
                )
            }
        }
    }
}
