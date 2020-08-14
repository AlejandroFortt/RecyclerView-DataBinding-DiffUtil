package com.fortatic.apps.recyclerview.databinding.diffutil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _data = MutableLiveData<MutableList<Item>>()
    val data: LiveData<MutableList<Item>>
        get() = _data

    init {
        loadData()
    }

    private fun loadData() {
        _data.value = mutableListOf(
            Item(1, "Hilt"),
            Item(2, "Paging"),
            Item(3, "CameraX"),
            Item(4, "Navigation"),
            Item(5, "Room"),
            Item(6, "ViewModel"),
            Item(7, "Work Manager"),
            Item(8, "App Startup"),
            Item(9, "DataBinding")
        )
    }

    fun shuffle() {
        // El método shuffle(), reordena la lista de forma aleatoria.
        _data.value?.shuffle()
    }
}