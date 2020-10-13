package com.example.navitest.ui.date

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DateViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is date Fragment"
    }
    val text: LiveData<String> = _text
}