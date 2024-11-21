package com.example.level1

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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
   Column (modifier = Modifier
       .fillMaxSize()
       .background(Color.White)){
       Box (modifier = Modifier.fillMaxWidth().height(70.dp)){
           Card (modifier = Modifier
               .fillMaxWidth()
               .height(50.dp)
               .shadow(
                   elevation = 8.dp,
                   ambientColor = Color.Black,
                   spotColor = Color.Black,
                   shape = RoundedCornerShape(topStart = 0.dp,
                       topEnd = 0.dp,
                       bottomStart = 15.dp,
                       bottomEnd = 15.dp),

                   ),
               RoundedCornerShape(
                   topStart = 0.dp,
                   topEnd = 0.dp,
                   bottomStart = 15.dp,
                   bottomEnd = 15.dp),
               colors = CardDefaults.cardColors(Color.Gray)){  }
       }

       LazyVerticalGrid(
           columns = GridCells.Fixed(2),
           modifier = Modifier.fillMaxSize()
               .background(Color.White).padding(start = 20.dp, end = 20.dp)
       ) {

           items(productShoesList){
                   productWidget -> Widget(ProductShoesEntity = productWidget)
           }
       }
   }

}