package com.example.level1

//pembuatan kelas
data class HomeScreenEntity(
    val id: String,
    val name: String,
    val category: String,
    val imageURL: String,
)
//membuat objek kelas
object menuObject{
    val shoes = HomeScreenEntity(
        id = "1",
        name = "Shoes",
        category = "Fasion",
        imageURL = "https://png.pngtree.com/png-vector/20231230/ourmid/pngtree-dropshipping-men-hole-sole-jogging-shoes-png-image_11389148.png"
    )
    val clothes = HomeScreenEntity(
        id = "2",
        name = "Clothes",
        category = "Fasion",
        imageURL = "https://freepngimg.com/thumb/categories/1508.png"
    )
    val gadget = HomeScreenEntity(
        id = "3",
        name = "Gadget",
        category = "Electronics",
        imageURL = "https://png.pngtree.com/png-clipart/20210121/ourmid/pngtree-3d-phone-with-transparent-background-png-image_2777462.jpg"
    )
    val toys = HomeScreenEntity(
        id = "4",
        name = "Toys",
        category = "Hobby & Kids",
        imageURL = "https://static.vecteezy.com/system/resources/previews/045/726/736/non_2x/toy-cars-trucks-and-other-toys-on-a-transparent-background-ai-generated-free-png.png"
    )
    val bag = HomeScreenEntity(
        id = "5",
        name = "Bag",
        category = "Fasion",
        imageURL = "https://static.vecteezy.com/system/resources/previews/023/522/781/non_2x/school-backpack-cutout-png.png"
    )
    val books = HomeScreenEntity(
        id = "6",
        name = "Books",
        category = "Education",
        imageURL = "https://www.shutterstock.com/image-photo/stack-colorful-books-isolated-on-600nw-2499703085.jpg"
    )
}