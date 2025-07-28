package com.jmp.rickandmortycharacters.common.compose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jmp.rickandmortycharacters.R
import com.jmp.rickandmortycharacters.common.compose.SmallGeneralPadding
import com.jmp.rickandmortycharacters.common.compose.TopBarBackground
import com.jmp.rickandmortycharacters.common.compose.debounced

@Composable
fun TopBar(onBackClicked: (() -> Unit)? = null) {
    Box(
        Modifier
            .fillMaxWidth()
            .background(
                TopBarBackground
            )
            .statusBarsPadding()
    ) {
        onBackClicked?.let {
            IconButton(
                onClick = debounced(onClick = onBackClicked),
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 16.dp)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    tint = Color.White,
                    contentDescription = "Back arrow"
                )
            }
        }
        Image(
            modifier = Modifier
                .padding(vertical = SmallGeneralPadding)
                .height(80.dp)
                .align(Alignment.Center),
            painter = painterResource(R.drawable.ic_rick_and_morty),
            contentDescription = "Logo"
        )
    }
}
