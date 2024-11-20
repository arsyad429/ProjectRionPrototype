package com.example.level1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.lazy.grid.items

@Composable
//membuat fungsi untuk menampilkan layar homescreen
fun HomeScreen(
    navController: NavController = rememberNavController()
) {
    val menulist = listOf(
        menuObject.toys,
        menuObject.bag,
        menuObject.gadget,
        menuObject.books,
        menuObject.clothes,
        menuObject.shoes
    )
    //untuk menampilkan beberapa kolom seperti grid
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),//menentukan jumlah kolom tetap yakni 2
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 20.dp)
    ){

        items(menulist){homeScreenEntity ->
            HomeScreenWidget(homeScreenEntity = homeScreenEntity){

            }

        }


    }
}