package com.example.level1

import androidx.compose.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage


@Composable



fun DetailProductScreen (
    product : productShoesEntity,
    navController: NavController = rememberNavController()

) {
    val productList = listOf(
        product.name,
        product.rating,
        product.imageURL
    )
    var state by remember{mutableStateOf(0)}
    Scaffold (floatingActionButton = {
        FloatingActionButton(onClick = { state -= 1 }) {
            Text("$state")
        }
    }
    ){ innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),//menentukan jumlah kolom tetap yakni 2
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.White)
                .padding(top = 20.dp)
        ){
            items(productList){
                Widget(
                    ProductShoesEntity = product,
                    onClick = {
                        state++
                    }
                )

            }


        }


    }

}


