package com.example.restaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurant.domain.Restaurant
import com.example.restaurant.presentation.MainPageViewModel
import com.example.restaurant.presentation.RestaurantsAdapter


class MainRestaurantFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    private val viewModel = MainPageViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_restaurant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView)
        observeViewModel()
        viewModel.start()
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainRestaurantFragment().apply {

            }
    }

    private fun observeViewModel() {
        viewModel.restaurantsData.observe(
            viewLifecycleOwner
        ) {
            applyData(it)
        }


    }
    private fun applyData(restaurantsList : List<Restaurant>){
        recyclerView.adapter =
            RestaurantsAdapter(restaurantsList,
                RestaurantsAdapter.OnClickListener {
                    navigateToRestaurant(it.id)
                }
            )
    }
    private fun navigateToRestaurant(restaurantId: Int){
        view.let {  }
    }
}