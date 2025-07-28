package com.jmp.rickandmortycharacters.detail.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.jmp.common.model.Character
import com.jmp.rickandmortycharacters.R
import com.jmp.rickandmortycharacters.common.compose.AlmostWhite
import com.jmp.rickandmortycharacters.common.compose.GeneralPadding
import com.jmp.rickandmortycharacters.common.compose.SmallGeneralHeight
import com.jmp.rickandmortycharacters.common.compose.SmallGeneralPadding
import com.jmp.rickandmortycharacters.common.compose.TinyGeneralPadding
import com.jmp.rickandmortycharacters.common.compose.fadingEdge
import com.jmp.rickandmortycharacters.common.compose.view.ErrorScreen
import com.jmp.rickandmortycharacters.common.compose.view.LoadingScreen
import com.jmp.rickandmortycharacters.common.compose.view.TopBar
import com.jmp.rickandmortycharacters.common.state.ResourceState
import com.jmp.rickandmortycharacters.detail.viewmodel.DetailViewModel

@Composable
fun DetailScreen(
    modifier: Modifier,
    navigationController: NavHostController,
    viewModel: DetailViewModel,
    characterId: Long
) {
    val uiState = viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadData(characterId)
    }

    when (val safeUiState = uiState.value) {
        is ResourceState.Loading ->
            LoadingScreen(modifier = modifier)
        is ResourceState.Success ->
            DetailScreenContent(
                modifier = modifier,
                navigationController = navigationController,
                character = safeUiState.data.character
            )
        is ResourceState.Error ->
            ErrorScreen(
                modifier = modifier,
                errorMessage = safeUiState.error.message
            )
    }
}

@Composable
private fun DetailScreenContent(
    modifier: Modifier,
    navigationController: NavHostController,
    character: Character
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopBar(onBackClicked = navigationController::popBackStack) },
        containerColor = White
    ) { padding ->
        Column(
            modifier = modifier
                .padding(padding)
                .fillMaxWidth()
                .fadingEdge()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(GeneralPadding))

            Image(
                modifier = Modifier
                    .height(260.dp)
                    .width(260.dp)
                    .clip(CircleShape),
                painter = rememberAsyncImagePainter(character.image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )

            Spacer(modifier = Modifier.height(SmallGeneralHeight))

            Text(
                text = character.name,
                style = MaterialTheme.typography.headlineMedium,
                color = DarkGray,
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(260.dp)
            )

            Spacer(modifier = Modifier.height(48.dp))

            Box(modifier = Modifier.padding(horizontal = GeneralPadding)) {
                Column(
                    modifier = Modifier
                        .background(
                            color = AlmostWhite,
                            shape = MaterialTheme.shapes.large
                        )
                        .clip(RoundedCornerShape(4.dp))
                        .padding(
                            horizontal = GeneralPadding,
                            vertical = GeneralPadding
                        )
                ) {
                    Row {
                        Icon(
                            modifier = Modifier
                                .padding(end = SmallGeneralPadding)
                                .size(24.dp),
                            painter = rememberAsyncImagePainter(R.drawable.ic_alien),
                            tint = DarkGray,
                            contentDescription = null
                        )

                        Text(
                            modifier = Modifier.padding(vertical = TinyGeneralPadding),
                            text = character.species,
                            style = MaterialTheme.typography.bodyMedium,
                            color = DarkGray,
                            fontFamily = FontFamily.Serif,
                            textAlign = TextAlign.Center,
                        )
                    }

                    Spacer(modifier = Modifier.height(SmallGeneralHeight))

                    Row {
                        Icon(
                            modifier = Modifier
                                .padding(end = SmallGeneralPadding)
                                .size(24.dp),
                            painter = rememberAsyncImagePainter(R.drawable.ic_sex),
                            tint = DarkGray,
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(vertical = TinyGeneralPadding),
                            text = character.gender,
                            style = MaterialTheme.typography.bodyMedium,
                            color = DarkGray,
                            fontFamily = FontFamily.Serif,
                            textAlign = TextAlign.Center,
                        )
                    }

                    Spacer(modifier = Modifier.height(SmallGeneralHeight))

                    Row {
                        Icon(
                            modifier = Modifier
                                .padding(end = SmallGeneralPadding)
                                .size(24.dp),
                            painter = rememberAsyncImagePainter(R.drawable.ic_status),
                            tint = DarkGray,
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(vertical = TinyGeneralPadding),
                            text = character.status.name.lowercase(),
                            style = MaterialTheme.typography.bodyMedium,
                            color = DarkGray,
                            fontFamily = FontFamily.Serif,
                            textAlign = TextAlign.Center,
                        )
                    }

                    Spacer(modifier = Modifier.height(SmallGeneralHeight))

                    Row {
                        Icon(
                            modifier = Modifier
                                .padding(end = SmallGeneralPadding)
                                .size(24.dp),
                            painter = rememberAsyncImagePainter(R.drawable.ic_location),
                            tint = DarkGray,
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(vertical = TinyGeneralPadding),
                            text = character.location.name.lowercase(),
                            style = MaterialTheme.typography.bodyMedium,
                            color = DarkGray,
                            fontFamily = FontFamily.Serif
                        )
                    }

                    Spacer(modifier = Modifier.height(SmallGeneralHeight))

                    Row {
                        Icon(
                            modifier = Modifier
                                .padding(end = SmallGeneralPadding)
                                .size(24.dp),
                            painter = rememberAsyncImagePainter(R.drawable.ic_from),
                            tint = DarkGray,
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(vertical = TinyGeneralPadding),
                            text = character.origin.name.lowercase(),
                            style = MaterialTheme.typography.bodyMedium,
                            color = DarkGray,
                            fontFamily = FontFamily.Serif,
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(GeneralPadding))
        }
    }
}
