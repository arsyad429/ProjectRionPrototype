package com.example.level1

import androidx.compose.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable

fun DetailProductScreen (
    name: String,
    modifier: Modifier = Modifier
) {
    Row {

        Text(name)
        Spacer(modifier = Modifier.padding(8.dp))

    }


}