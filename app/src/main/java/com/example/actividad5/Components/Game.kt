package com.example.actividad5.Components

import androidx.annotation.DrawableRes

data class Game(
    val name: String,
    val price: Int,
    val edition: String,
    val classification: String,
    @DrawableRes val image: Int,
)