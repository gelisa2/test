package com.elisa.test.di

import com.elisa.test.database.TasksDataBase
import com.elisa.test.repository.TasksRepository
import com.elisa.test.viewmodel.RagacaViewModel
import com.elisa.test.viewmodel.TasksViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { TasksDataBase.getInstance(get()) }
    single { get<TasksDataBase>().taskDao() }
    single { TasksRepository(get()) }
    viewModel { TasksViewModel(get()) as TasksViewModel }
//    viewModel { RagacaViewModel()}
}
