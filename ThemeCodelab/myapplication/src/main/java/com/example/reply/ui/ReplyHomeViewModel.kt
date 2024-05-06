package com.example.reply.ui

import android.provider.ContactsContract
import androidx.lifecycle.ViewModel
import com.example.reply.data.LocalEmailsDataProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ReplyHomeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ReplyHomeUIState(loading = true))
    val uiState: StateFlow<ReplyHomeUIState> = _uiState

    init {
        initiEmailList()
    }

    private fun initEmailList(){
        val emails = LocalEmailsDataProvider.allEmails
        _uiState.value = ReplyHomeUIState(
            emails = emails,
            selectedEmail = emails.first()
        )

        fun setSelectedEmail(emailId: Long) {

        }

        fun closeDetailScreen() {
            _uiState.value = _uiState
                .value.copy(
                    isDetailOnlyOpen = false,
                    selectedEmail = _uiState.value.emails.first()
                )
        }
    }
}

data class ReplyHomeUIState(
    val emails: List<Email> = emptyList(),
    val selectedEmail: Email? = null,
    val isDetailOnlyOpen: Boolean = false,
    val loading: Boolean = false,
    val error: String? = null
)