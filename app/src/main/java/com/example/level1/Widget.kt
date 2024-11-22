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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
            .width(172.dp)
            .height(198.dp)
            .background(Color.White)
            .padding(16.dp),

            verticalAlignment = Alignment.CenterVertically
    ){

        Card(modifier = Modifier
            .width(148.dp)
            .height(176.dp)
            .shadow(
                elevation = 5.dp,
                ambientColor = Color.Black,
                spotColor = Color.Black,
                shape = RoundedCornerShape(10.dp)
            ),
            colors = CardDefaults.cardColors(Color.White))
        {
            Card(modifier = Modifier
                .height(90.dp)
                .width(150.dp),
                colors = CardDefaults.cardColors(Color.Transparent)
            ) { AsyncImage(
                model = ProductShoesEntity.imageURL,
                contentDescription = ProductShoesEntity.name,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            ) }
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(ProductShoesEntity.name, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(2.dp))
                Card (
                    modifier = Modifier
                        .width(40.dp)
                        .height(25.dp),
                    colors = CardDefaults.cardColors(Color.White)
                ){  Box (modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.TopCenter
                )
                {Text(ProductShoesEntity.rating.toString() + " ⭐", fontSize = 8.sp, fontWeight = FontWeight.Normal)  } }
            }


        }
    }
}