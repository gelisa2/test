package com.elisa.test.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.elisa.test.model.TasksEntity

@Database(
    entities = [TasksEntity::class],
    version = 1
)
abstract class TasksDataBase : RoomDatabase() {

    abstract fun taskDao(): TasksDao

    companion object {

        private var INSTANCE: TasksDataBase? = null

        fun getInstance(context: Context): TasksDataBase {

            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TasksDataBase::class.java,
                        "tasks_Database"
                    ).build()


                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}