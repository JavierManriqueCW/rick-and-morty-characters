package com.jmp.rickandmortycharacters.common.navigation

import androidx.navigation.NavType.Companion.LongType
import androidx.navigation.navArgument
import com.jmp.rickandmortycharacters.common.navigation.ArgumentKeys.CHARACTER_ID_ARGUMENT_KEY

sealed class Screen(val route: String) {
    data object Onboarding : Screen("onboarding")

    data object Characters : Screen("characters")

    data object CharacterDetail : Screen("characterDetail/{${CHARACTER_ID_ARGUMENT_KEY}}") {
        fun createRoute(characterId: Long) = "characterDetail/$characterId"

        val arguments = listOf(
            navArgument(CHARACTER_ID_ARGUMENT_KEY) { type = LongType }
        )
    }
}

object ArgumentKeys {
    const val CHARACTER_ID_ARGUMENT_KEY = "characterId"
}
