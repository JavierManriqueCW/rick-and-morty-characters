package com.jmp.rickandmortycharacters.common.compose

import android.os.SystemClock
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager

fun Modifier.fadingEdge(
    topEndFadedPoint: Float = 0.0f,
    topStartFadingPoint: Float = 0.05f,
    bottomStartFadingPoint: Float = 0.95f,
    bottomEndFadedPoint: Float = 1f,
    linearEasing: Boolean = true
) = this
    .graphicsLayer(compositingStrategy = CompositingStrategy.Offscreen)
    .drawWithContent {
        drawContent()
        drawRect(
            brush =
                if (linearEasing) {
                    Brush.verticalGradient(
                        topEndFadedPoint to Color.Transparent,
                        topStartFadingPoint to Color.Black,
                        bottomStartFadingPoint to Color.Black,
                        bottomEndFadedPoint to Color.Transparent
                    )
                } else {
                    val averageTopFadingPoint = (topEndFadedPoint + topStartFadingPoint) / 2
                    val averageBottomFadingPoint = (bottomStartFadingPoint + bottomEndFadedPoint) / 2
                    Brush.verticalGradient(
                        topEndFadedPoint to Color.Transparent,
                        averageTopFadingPoint to Color.Black.copy(alpha = 0.3f),
                        topStartFadingPoint to Color.Black,
                        bottomStartFadingPoint to Color.Black,
                        averageBottomFadingPoint to Color.Black.copy(alpha = 0.3f),
                        bottomEndFadedPoint to Color.Transparent
                    )},
            blendMode = BlendMode.DstIn
        )
    }

fun Modifier.clearFocusOnTap(): Modifier = composed {
    val focusManager = LocalFocusManager.current
    Modifier.pointerInput(Unit) {
        awaitEachGesture {
            awaitFirstDown(pass = PointerEventPass.Initial)
            val upEvent = waitForUpOrCancellation(pass = PointerEventPass.Initial)
            if (upEvent != null) {
                focusManager.clearFocus()
            }
        }
    }
}

@Composable
inline fun debounced(
    debounceTime: Long = 1000L,
    crossinline onClick: () -> Unit
): () -> Unit {
    var lastTime by remember { mutableLongStateOf(0L) }
    return {
        val now = SystemClock.uptimeMillis()
        if (now - lastTime > debounceTime) {
            lastTime = now
            onClick()
        }
    }
}
