package com.example.level1

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview

fun productScren() {
    val productShoesList = listOf(
        productShoesObject.sepatusuper1,
        productShoesObject.sepatusuper2,
        productShoesObject.sepatusuper3,
        productShoesObject.sepatusuper4,
        productShoesObject.sepatusuper5,
        productShoesObject.sepatusuper6,
        productShoesObject.sepatusuper7,
        productShoesObject.sepatusuper8,
        productShoesObject.sepatusuper9,
        productShoesObject.sepatusuper10,
        )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize()
            .background(Color.White).padding(16.dp)
    ) {
    items(productShoesList){
        WidgetProduct -> Widget(ProductShoesEntity = productShoesObject.sepatusuper)
    }
    }
}