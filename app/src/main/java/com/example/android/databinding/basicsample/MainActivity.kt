package com.example.android.databinding.basicsample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.databinding.basicsample.databinding.ActivityMainBinding
import com.example.android.databinding.basicsample.ui.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btnOldVersion -> {
                PlainOldActivity.launch(this)
            }
            R.id.btnSolution2 -> {
                PlainOldActivitySolution2.launch(this)
            }
            R.id.btnSolution3 -> {
                PlainOldActivitySolution3.launch(this)
            }
            R.id.btnSolution4 -> {
                PlainOldActivitySolution4.launch(this)
            }
            R.id.btnSolution5 -> {
                PlainOldActivitySolution5.launch(this)
            }
            R.id.btnFinalSolution -> {
                SolutionActivity.launch(this)
            }
        }
    }
}
