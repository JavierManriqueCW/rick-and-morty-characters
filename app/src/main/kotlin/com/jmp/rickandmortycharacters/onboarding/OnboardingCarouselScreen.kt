package com.jmp.rickandmortycharacters.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.jmp.rickandmortycharacters.R
import com.jmp.rickandmortycharacters.common.compose.DotSize
import com.jmp.rickandmortycharacters.common.compose.GeneralPadding
import com.jmp.rickandmortycharacters.common.compose.MediumGeneralPadding

private const val FIRST_ONBOARDING_SCREEN_INDEX = 0
private const val SECOND_ONBOARDING_SCREEN_INDEX = 1
private const val SCREENS_COUNT = 2

@Composable
fun OnboardingCarousel(
    modifier: Modifier,
    onOnboardingFinished: () -> Unit
) {
    var currentScreenIndex by remember { mutableIntStateOf(FIRST_ONBOARDING_SCREEN_INDEX) }

    ConstraintLayout(modifier = modifier.padding(top = GeneralPadding)) {
        val (content, bottomSection) = createRefs()

        Box(
            modifier = Modifier
                .constrainAs(content) {
                    top.linkTo(parent.top)
                    bottom.linkTo(bottomSection.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = Dimension.wrapContent
                    width = Dimension.fillToConstraints
                }
        ) {
            when (currentScreenIndex) {
                FIRST_ONBOARDING_SCREEN_INDEX ->
                    OnboardingStepScreen(
                        title = "I'M MISTER MEESEEKS!",
                        description = "this is a Jetpack Compose template look at me",
                        image = R.drawable.im_onboarding_step_1
                    )

                SECOND_ONBOARDING_SCREEN_INDEX ->
                    OnboardingStepScreen(
                        title = "BE WELCOME",
                        description = "Hope you have a nice time around here!",
                        image = R.drawable.im_onboarding_step_2,
                    )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(bottomSection) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = Dimension.wrapContent
                    width = Dimension.fillToConstraints
                }
                .padding(bottom = GeneralPadding)
        ) {
            Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                repeat(SCREENS_COUNT) { index ->
                    val dotColor =
                        if (index == currentScreenIndex) Color.Black
                        else Color.Gray

                    Box(
                        modifier = Modifier
                            .size(DotSize)
                            .background(color = dotColor, shape = CircleShape)
                            .padding(MediumGeneralPadding)
                    )

                    if (index < SECOND_ONBOARDING_SCREEN_INDEX) {
                        Spacer(modifier = Modifier.width(DotSize))
                    }
                }
            }

            Spacer(modifier = Modifier.height(64.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GeneralPadding),
                onClick = {
                    if (currentScreenIndex < SECOND_ONBOARDING_SCREEN_INDEX) {
                        currentScreenIndex++
                    } else {
                        onOnboardingFinished()
                    }
                },
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(text = "Next")
            }

            TextButton(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = onOnboardingFinished,
            ) {
                Text(text = "Skip", color = Color.Gray)
            }
        }
    }
}
