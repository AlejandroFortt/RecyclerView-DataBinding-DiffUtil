package com.fortatic.apps.recyclerview.databinding.diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ItemAdapter()
        rvItem.adapter = adapter

        /**
         * Observamos a la lista declarada en MainViewModel.
         * Cada vez que haya algún cambio, este observador se activará y
         * se mandará una lista actualizada a ItemAdapter.
         */
        mainViewModel.data.observe(this, Observer {
            // Enviamos la lista al adaptador.
            adapter.submitList(it)
        })
    }
}
