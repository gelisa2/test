package com.elisa.test.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.elisa.test.model.TasksEntity
import com.elisa.test.repository.TasksRepository

class TasksViewModel(val repo: TasksRepository): ViewModel() {

    private val _allTasks = MutableLiveData<ArrayList<TasksEntity>>()
    var allTasks: LiveData<ArrayList<TasksEntity>> = _allTasks

    suspend fun getAllTasks(): LiveData<ArrayList<TasksEntity>> {
        _allTasks.postValue(repo.getTodos())
        return _allTasks
    }

    suspend fun insert(tasksEntity: TasksEntity) {
        repo.insert(tasksEntity)
    }

}