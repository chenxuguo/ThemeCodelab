package com.bignerdranch.android.basicstatecodelab2

import android.os.ParcelFileDescriptor.OnCloseListener
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit
){
    LazyColumn(
        modifier = modifier,
    ){
        items(
            items = list,
            key = {task -> task.id }
        ) { task ->
            WellnessTaskItem(taskName = task.label, onClose = { onCloseTask(task) })
        }
    }
}
