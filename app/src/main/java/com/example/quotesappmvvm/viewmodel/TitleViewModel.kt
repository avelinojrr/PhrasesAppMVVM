package com.example.quotesappmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quotesappmvvm.model.ListTitle
import com.example.quotesappmvvm.model.TitleModel

class TitleViewModel: ViewModel() {

    private val titleModel = MutableLiveData<TitleModel>()

    fun getTitle(){
        val currentTitle : TitleModel = ListTitle.titleRandom()
        titleModel.postValue(currentTitle)
    }

}
