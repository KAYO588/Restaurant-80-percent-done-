package com.example.restaurant.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.restaurant.domain.Restaurant


@Entity(tableName = "restaurants")
data class RestaurantModel(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "image_url")
    val imageUrl: String,
    @ColumnInfo(name = "address")
    val address: String,
    @ColumnInfo(name = "working_time")
    val workingTime: String,
    @ColumnInfo(name = "discription")
    val description: String,

)

fun RestaurantModel.toDomainModel() = Restaurant(    //конвертация облочной модели, которую мы используем
    id, name, imageUrl, address, workingTime, description
)
