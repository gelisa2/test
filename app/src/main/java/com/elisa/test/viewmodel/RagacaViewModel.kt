package com.elisa.test.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.elisa.test.model.TasksEntity

class RagacaViewModel: ViewModel() {


    fun getData(): MutableLiveData<TasksEntity> {
        var d = MutableLiveData<TasksEntity>()
        println()
        return d
    }


}