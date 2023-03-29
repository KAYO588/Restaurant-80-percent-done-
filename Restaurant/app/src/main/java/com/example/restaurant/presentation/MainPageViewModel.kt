package com.example.restaurant.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restaurant.App
import com.example.restaurant.domain.Restaurant

class MainPageViewModel: ViewModel() {

    private val database = App.databaseRepositorty
    val restaurantsData = MutableLiveData<List<Restaurant>>()

    fun start() {
        getRestaurantsList()
    }

    private fun getRestaurantsList(){
        val restaurants = database.getAllRestaurants()
        restaurantsData.postValue(restaurants)
    }
}