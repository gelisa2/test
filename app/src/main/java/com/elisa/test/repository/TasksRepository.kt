package com.elisa.test.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.elisa.test.database.TasksDao
import com.elisa.test.model.TasksEntity

class TasksRepository(val tasksDao: TasksDao): TasksDao {

    override suspend fun insert(tasksEntity: TasksEntity) {
        tasksDao.insert(tasksEntity)
    }

    override suspend fun delete(tasksEntity: TasksEntity) {
    }

    override suspend fun getTodos(): ArrayList<TasksEntity> {
        return tasksDao.getTodos()
    }
}