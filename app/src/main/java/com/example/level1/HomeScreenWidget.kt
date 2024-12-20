package com.example.level1

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
@Preview
//membuat fungsi untuk widget halaman home
fun HomeScreenWidget(
    homeScreenEntity: HomeScreenEntity = menuObject.toys,
    onClick: (homeScreenEntity:HomeScreenEntity)-> Unit={}
) {
    //membuat kolom
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
        .padding(8.dp)
        .clickable{
            Log.d("Navigation", "Navigating to product_screen")
            onClick(homeScreenEntity)
        },
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //membuat card untuk gambar dan deskripsi produk
        Card (modifier = Modifier
            
            .width(100.dp)
            .height(100.dp)
            .shadow(
                elevation = 5.dp,
                ambientColor = Color.Black,
                spotColor = Color.Black,
                shape = RoundedCornerShape(10.dp)
            )
        ){

            AsyncImage(
                model = homeScreenEntity.imageURL,
                contentDescription = homeScreenEntity.name,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            //memberi jarak spasi


        }
        Spacer(modifier = Modifier.height(8.dp))
        //menampilkan teks
        Text(
            text = homeScreenEntity.name,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 4.dp)
        )
        //memberi jarak
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = homeScreenEntity.category,
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 4.dp)
        )

    }
}