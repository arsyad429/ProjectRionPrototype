package com.example.level1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview

fun ProductDetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Gambar produk
        Card(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .shadow(
                    elevation = 5.dp,
                    ambientColor = Color.Black,
                    spotColor = Color.Black,
                    shape = RoundedCornerShape(10.dp)),
        ) { }

        Spacer(modifier = Modifier.height(16.dp))

        // Judul produk
        Text( text = "Stainless Steel Water Bottle",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,)

        // Rating
        Text(
            text = "4.8 Stars",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Deskripsi produk
        Text(
            text = "500ml stainless steel water bottle with a vacuum insulation feature to keep drinks hot or cold.",
            fontSize = 14.sp,
            color = Color.Black
        )
    }
}