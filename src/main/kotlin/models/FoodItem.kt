package models

import enums.FoodCategory

data class FoodItem(
    val foodCategory: FoodCategory,
    val name: String,
    val description: String,
    val price:Double
){

}