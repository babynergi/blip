package com.example.navitest.ui.description

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DescriptionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is description Fragment"
    }
    val text: LiveData<String> = _text
}