package com.jmp.rickandmortycharacters.list.view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.jmp.common.model.Character
import com.jmp.common.model.Status
import com.jmp.rickandmortycharacters.common.compose.AliveGreen
import com.jmp.rickandmortycharacters.common.compose.AlmostWhite
import com.jmp.rickandmortycharacters.common.compose.DeadRed
import com.jmp.rickandmortycharacters.common.compose.ListItemImageBorderWidth
import com.jmp.rickandmortycharacters.common.compose.MediumGeneralPadding
import com.jmp.rickandmortycharacters.common.compose.SmallGeneralHeight
import com.jmp.rickandmortycharacters.common.compose.TinyGeneralPadding

const val EXPAND_IN_ANIMATION_DURATION = 400
const val FADE_IN_ANIMATION_DURATION = 800
const val INITIAL_FADE_IN_ALPHA = 0.4f
const val IMAGE_SIZE = 120

@Composable
fun ListItem(
    character: Character,
    onCharacterClicked: () -> Unit
) {
    var isVisible by remember { mutableStateOf(false) }
    val initialCellSize = (LocalWindowInfo.current.containerSize.width.dp / 1.7f).value.toInt()

    AnimatedVisibility(
        visible = isVisible,
        enter = fadeIn(
            animationSpec = TweenSpec(FADE_IN_ANIMATION_DURATION, easing = FastOutSlowInEasing),
            initialAlpha = INITIAL_FADE_IN_ALPHA
        ) + expandIn(
            expandFrom = Alignment.CenterStart,
            animationSpec = TweenSpec(durationMillis = EXPAND_IN_ANIMATION_DURATION),
            initialSize = { IntSize(initialCellSize, initialCellSize) }
        )
    ) {
        Column(
            modifier = Modifier
                .padding(MediumGeneralPadding)
                .fillMaxWidth()
                .animateContentSize()
                .clickable(onClick = onCharacterClicked),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(IMAGE_SIZE.dp)
                    .clip(CircleShape)
                    .border(
                        width = ListItemImageBorderWidth,
                        color =
                            when (character.status) {
                                Status.ALIVE -> AliveGreen
                                Status.DEAD -> DeadRed
                                else -> Color.Gray
                            },
                        shape = CircleShape
                    ),
                painter = rememberAsyncImagePainter(character.image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(SmallGeneralHeight))

            Box(
                modifier = Modifier
                    .background(
                        color = AlmostWhite,
                        shape = MaterialTheme.shapes.medium
                    )
                    .padding(TinyGeneralPadding)
            ) {
                Text(
                    text = character.name,
                    style = MaterialTheme.typography.labelLarge,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(IMAGE_SIZE.dp)
                )
            }
        }
    }

    LaunchedEffect(Unit) { isVisible = true }
}
