package com.example.restaurant.presentation

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurant.R
import com.example.restaurant.domain.Restaurant
import org.w3c.dom.Text

class RestaurantsViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

    private val title: TextView = itemView.findViewById(R.id.title)
    private val addressAndTime: TextView = itemView.findViewById(R.id.address_and_time)
    private val image: ImageView = itemView.findViewById(R.id.imageView)


    fun bind(restaurant: Restaurant) {
        val addressAndTimeText = restaurant.address + COMMA + SPACE + restaurant.workingTime
        val resoureId = itemView.resources.getIdentifier(
            restaurant.imageUrl, "drawable",
            itemView.context.packageName
        )
        title.text = restaurant.name
        addressAndTime.text = addressAndTimeText
        image.setImageDrawable(itemView.resources.getDrawable(resoureId))
    }

    companion object {
        private const val SPACE = " "
        private const val COMMA = ","
    }

}