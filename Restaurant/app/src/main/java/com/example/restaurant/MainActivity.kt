package com.example.restaurant

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurant.data.RestaurantModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.databaseRepositorty.deleteAll()
        addMockRestaurantsToDB()
        setContentView(R.layout.activity_main)
        window.decorView.setBackgroundColor(Color.BLACK)
    }

    private fun addMockRestaurantsToDB(){
        App.databaseRepositorty.insertRestaurants(
            rest1 = RestaurantModel(
                id = 1,
                name = "LILA",
                imageUrl = "lila",
                address = "Москва, ул. Сретенка, 22/1с1",
                workingTime = "09:00-23:00",
                description = "Описание"
            ),
            rest2 = RestaurantModel(
                id = 2,
                name = "Jpan",
                imageUrl = "jpan",
                address = "Москва, ул. Трубная ул. 21",
                workingTime = "10:00-23:00",
                description = "Описание"
            ),
            rest3 = RestaurantModel(
                id = 3,
                name = "Хорошая девчока",
                imageUrl = "good",
                address = "Москва, ул. Сретенка, 22/1с1",
                workingTime = "09:00-00:00",
                description = "Описание"
            ),
            rest4 = RestaurantModel(
                id = 4,
                name = "Хачапури и вино",
                imageUrl = "hachapyro",
                address = "Москва, ул. Солянка, 1/2",
                workingTime = "09:00-23:00",
                description = "Описание"
            ),
            rest5 = RestaurantModel(
                id = 5,
                name = "White rabbit",
                imageUrl = "white_rabbit",
                address = "Москва, Смоленская пл., 3",
                workingTime = "09:00-23:00",
                description = "Описание"
            ),

        )
    }
}