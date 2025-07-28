package com.jmp.rickandmortycharacters.list.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.navigation.NavHostController
import com.jmp.common.model.Character
import com.jmp.rickandmortycharacters.common.compose.GeneralPadding
import com.jmp.rickandmortycharacters.common.compose.clearFocusOnTap
import com.jmp.rickandmortycharacters.common.compose.fadingEdge
import com.jmp.rickandmortycharacters.common.compose.view.ErrorScreen
import com.jmp.rickandmortycharacters.common.compose.view.LoadingScreen
import com.jmp.rickandmortycharacters.common.compose.view.TopBar
import com.jmp.rickandmortycharacters.common.navigation.Screen
import com.jmp.rickandmortycharacters.common.state.ResourceState
import com.jmp.rickandmortycharacters.list.state.ListUiState
import com.jmp.rickandmortycharacters.list.viewmodel.ListViewModel

@Composable
fun ListScreen(
    modifier: Modifier,
    navigationController: NavHostController,
    viewModel: ListViewModel
) {
   val uiState = viewModel.uiState.collectAsState()

    when (val safeUiState = uiState.value) {
        is ResourceState.Loading -> LoadingScreen(modifier = modifier)
        is ResourceState.Success ->
            ListContent(
                modifier = modifier,
                uiState = safeUiState.data,
                onCharacterClicked = { navigationController.navigate(Screen.CharacterDetail.createRoute(it.id)) }
            )
        is ResourceState.Error ->
            ErrorScreen(
                modifier = modifier,
                errorMessage = safeUiState.error.message,
                onReloadClick = { viewModel.reload() }
            )
    }
}

@Composable
fun ListContent(
    modifier: Modifier,
    uiState: ListUiState,
    onCharacterClicked: (Character) -> Unit
) {
    val searchText = remember { mutableStateOf("") }
    val filteredList =
        if (searchText.value.isEmpty()) uiState.rawList
        else uiState.rawList.filter { it.name.contains(searchText.value, ignoreCase = true) }

    Scaffold(
        modifier = modifier.clearFocusOnTap(),
        containerColor = White,
        topBar = { TopBar() }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            SearchBar(searchText)

            LazyColumn(
                modifier = Modifier.fadingEdge(),
                state = rememberLazyListState(),
                contentPadding = PaddingValues(GeneralPadding)
            ) {
                items(filteredList) { character ->
                    ListItem(
                        character = character,
                        onCharacterClicked = { onCharacterClicked(character) }
                    )
                }
            }
        }
    }
}
