package com.fortatic.apps.recyclerview.databinding.diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val data = arrayListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        setupRecycler()
    }

    private fun loadData() {
        for (i in 1..20) {
            data.add(Item(i, "Lorem$i ipsum dolor sit amet, consectetur adipisicing elit."))
        }
    }

    private fun setupRecycler() {
        val adapter = ItemAdapter()
        rvItem.adapter = adapter
        adapter.submitList(data)
    }
}
