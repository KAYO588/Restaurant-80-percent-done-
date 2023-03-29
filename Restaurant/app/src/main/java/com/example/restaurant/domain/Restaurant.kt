package com.example.restaurant.domain

data class Restaurant(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val address: String,
    val workingTime: String,
    val description: String,
)
