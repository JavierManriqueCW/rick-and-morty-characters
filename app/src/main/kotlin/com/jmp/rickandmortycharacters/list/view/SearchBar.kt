package com.jmp.rickandmortycharacters.list.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import com.jmp.rickandmortycharacters.common.compose.AlmostWhite
import com.jmp.rickandmortycharacters.common.compose.GeneralPadding
import com.jmp.rickandmortycharacters.common.compose.RymBlue
import com.jmp.rickandmortycharacters.common.compose.SmallGeneralPadding

@Composable
fun SearchBar(searchText: MutableState<String>) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = GeneralPadding,
                top = SmallGeneralPadding,
                end = GeneralPadding
            )
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = searchText.value,
            onValueChange = { searchText.value = it },
            placeholder = {
                Text(
                    text = "Search characters",
                    color = Color.DarkGray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            },
            colors = TextFieldDefaults.colors().copy(
                cursorColor = RymBlue,
                focusedTextColor = Color.DarkGray,
                unfocusedTextColor = Color.DarkGray,
                focusedContainerColor = AlmostWhite,
                unfocusedContainerColor = AlmostWhite,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                focusedLeadingIconColor = Color.DarkGray,
                unfocusedLeadingIconColor = Color.DarkGray
            ),
            leadingIcon = {
                Icon(
                    modifier = Modifier.size(GeneralPadding),
                    imageVector = Icons.Sharp.Search,
                    contentDescription = "Search icon"
                )
            },
            shape = CircleShape,
            textStyle = TextStyle(textAlign = TextAlign.Center),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            )
        )
    }
}
