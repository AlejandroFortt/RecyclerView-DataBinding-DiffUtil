package com.fortatic.apps.recyclerview.databinding.diffutil

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.fortatic.apps.recyclerview.databinding.diffutil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)

        binding.viewModel = mainViewModel

        val adapter = ItemAdapter()
        binding.rvItem.adapter = adapter

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
