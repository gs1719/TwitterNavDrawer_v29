package com.example.twitterappui.ui.highlights

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HighlightsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Highlight Fragment"
    }
    val text: LiveData<String> = _text
}