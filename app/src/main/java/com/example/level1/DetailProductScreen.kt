package com.example.level1

import androidx.compose.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


@Composable

fun DetailProductScreen (
    product : productShoesEntity,

) {
    var state by remember{mutableStateOf(0)}
    Scaffold (floatingActionButton = {
        FloatingActionButton(onClick = { state -= 1 }) {
            Text("$state")
        }
    }
    ){ innerPadding ->
        Row {
            AsyncImage(
                model = product.imageURL,
                contentDescription = "Product Image",
                modifier = Modifier
                    .size(150.dp)
                    .padding(innerPadding)

            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text(product.name)
            Spacer(modifier = Modifier.padding(8.dp))
            Text(product.rating.toString())
        }

    }



}