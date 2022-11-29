package com.elisa.test.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.elisa.test.model.TasksEntity

@Dao
interface TasksDao {

    @Insert //(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert (tasksEntity: TasksEntity)

    @Delete
    suspend fun delete (tasksEntity: TasksEntity)

    @Query("SELECT * FROM  tasksTable")
    suspend fun getTodos(): ArrayList<TasksEntity>
}