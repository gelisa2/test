package com.elisa.test.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Helpers.insert
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import com.elisa.test.R
import com.elisa.test.model.TasksEntity
import com.elisa.test.viewmodel.RagacaViewModel
import com.elisa.test.viewmodel.TasksViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val tasksViewModel by viewModel<TasksViewModel>()
    private val tasksViewModel2 by viewModel<RagacaViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lifecycleScope.launch {
            tasksViewModel2.getData().observe(this@MainActivity) {
                println()
            }
        }

//        lifecycleScope.launch {
//            var eelement = TasksEntity("asdadsa")
//            var eelement2 = TasksEntity("asdadsadsadsa")
//            var eelement3 = TasksEntity("asdadsadsadsa")
//            var eelement4 = TasksEntity("asddsadsaadsa")
//            tasksViewModel2.insert(eelement)
//        }
    }
}