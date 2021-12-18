package com.fisma.marketplacefisma.ui.keranjang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KeranjangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Selamat Datang Di Keranjang"
    }
    val text: LiveData<String> = _text
}