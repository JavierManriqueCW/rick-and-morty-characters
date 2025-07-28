package com.jmp.rickandmortycharacters.common.compose.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jmp.rickandmortycharacters.R
import com.jmp.rickandmortycharacters.common.compose.GeneralPadding

@Composable
fun ErrorScreen(
    modifier: Modifier,
    errorMessage: String,
    onReloadClick: (() -> Unit)? = null
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 24.dp),
                text = errorMessage,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )

            onReloadClick?.let {
                Spacer(modifier = Modifier.height(GeneralPadding))

                Button(onClick = onReloadClick) {
                    Text(text = stringResource(R.string.reload))
                }
            }
        }
    }
}
