package com.example.level1

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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
@Preview

fun Widget(
    ProductShoesEntity: productShoesEntity = productShoesObject.sepatusuper,

){
    Row(
        modifier = Modifier
            .width(162.dp)
            .height(188.dp)
            .background(Color.White)
            .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
    ){

        Card(modifier = Modifier
            .width(138.dp)
            .height(166.dp))
        {
            Card(modifier = Modifier
                .height(90.dp)
                .width(150.dp),
                colors = CardDefaults.cardColors(Color.Red)
            ) { }
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(ProductShoesEntity.name, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(2.dp))
                Card (
                    modifier = Modifier
                        .width(40.dp)
                        .height(13.dp),
                    colors = CardDefaults.cardColors(Color.Blue)
                ){  Box (modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                )
                {Text(ProductShoesEntity.rating.toString() + " Rating", fontSize = 8.sp, fontWeight = FontWeight.Normal)  } }
            }


        }
    }
}