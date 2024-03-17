package com.vinayakgupta3112.jettrivia.component

import android.util.Log
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import com.vinayakgupta3112.jettrivia.screens.QuestionsViewModel

@Composable
fun Questions(viewModel: QuestionsViewModel) {
    val questions = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true) {
        CircularProgressIndicator()
        Log.d("Loading", "Questions: Loading.....")
    } else {
        Log.d("Loading", "Questions: Loading Stopped.....")
        questions?.forEach{questionItem ->
            Log.d("Result", "Questions: ${questionItem.question}")
        }
    }
}