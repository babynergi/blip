package com.example.navitest.ui.top5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.navitest.R

class Top5Fragment : Fragment() {

    private lateinit var top5ViewModel: Top5ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        top5ViewModel =
                ViewModelProviders.of(this).get(Top5ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_top5, container, false)
        val textView: TextView = root.findViewById(R.id.text_top5)
        top5ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}