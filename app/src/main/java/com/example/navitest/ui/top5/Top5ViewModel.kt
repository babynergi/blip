package com.example.navitest.ui.top5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Top5ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is top5 Fragment"
    }
    val text: LiveData<String> = _text
}