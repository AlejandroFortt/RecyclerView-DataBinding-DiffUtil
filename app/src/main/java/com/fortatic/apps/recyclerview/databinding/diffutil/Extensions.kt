package com.fortatic.apps.recyclerview.databinding.diffutil

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("loadData")
fun TextView.loadData(item: Item){
    text = item.content
}