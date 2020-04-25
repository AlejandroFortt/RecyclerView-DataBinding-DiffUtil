package com.fortatic.apps.recyclerview.databinding.diffutil

data class Item(
    val id: Int,
    val content: String
) {
    override fun toString(): String {
        return "Item : id=$id, content=$content"
    }
}