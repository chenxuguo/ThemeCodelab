package com.bignerdranch.android.basicstatecodelab2

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Preview
@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()) {
    Column(modifier = modifier) {
        StatefulCounter()

        WellnessTasksList(list = wellnessViewModel.tasks, onCloseTask = { task -> wellnessViewModel.remove(task)})
    }
}


