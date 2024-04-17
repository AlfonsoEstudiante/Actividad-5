package com.example.actividad5.ViewModels

import androidx.lifecycle.ViewModel
import com.example.actividad5.R
import com.example.actividad5.Components.Game

class GamesViewModel: ViewModel() {

    fun getGameList(): ArrayList<Game> {

        var gameList: ArrayList<Game> = ArrayList<Game>()

        gameList.add(Game("Need For Speed", 900, "Hot Pursuit", "R", R.drawable.hot1))
        gameList.add(Game("Need For Speed", 1300, "Undercover", "E", R.drawable.hot2))
        gameList.add(Game("Need For Speed", 1100, "World", "E10", R.drawable.hot3))
        gameList.add(Game("Need For Speed", 1000, "Rivals", "E10", R.drawable.hot4))
        gameList.add(Game("Need For Speed", 1100, "Most Wanted", "M", R.drawable.hot5))
        gameList.add(Game("Need For Speed", 1000, "Payback", "M", R.drawable.hot6))

        return gameList
    }
}