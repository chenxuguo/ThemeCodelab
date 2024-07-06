package com.example.reply.ui

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.reply.data.LocalEmailsDataProvider
import com.example.reply.ui.ReplyApp
import com.example.reply.ui.ReplyHomeUIState
import com.example.reply.ui.theme.AppTheme

class MainActivity {
    private val viewModel: ReplyHomeViewModel by viewModels()
    setContent {
        val uiState by viewModel.uiState.collectAsState()

        AppTheme {
            ReplyApp(/* .. */)
        }
    }
}

@Composable
ReplyApp(){

}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "DefaultPreviewLight"
)
@Composable
fun ReplyAppPreview() {
    AppTheme {
        ReplyApp(
            replyHomeUIState = ReplyHomeUIState(
                emails = LocalEmailsDataProvider.allEmails
            )
        )
    }
}

