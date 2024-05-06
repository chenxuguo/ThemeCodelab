package com.example.reply.ui

import android.app.PictureInPictureUiState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.bignerdranch.android.myapplication.R

@Composable
fun ReplyApp (replyHomeUIState: ReplyHomeUIState,
              closeDetailScreen: () -> Unit = {},
              navigateToDetail: (Long) -> Unit = {}
){
    ReplyAppContent(
        replyHomeUIState = replyHomeUIState,
        closeDetailScreen = closeDetailScreen,
        navigateToDetail = navigateToDetail
    )
}

@Composable
fun ReplyAppContent(
    modifier: Modifier = Modifier,
    replyHomeUIState: ReplyHomeUIState,
    closeDetailScreen: () -> Unit,
    navigateToDetail: (Long) -> Unit,
) {
    val selectedDestination = remember { mutableStateOf(ReplyRoute.INBOX)}

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        if (selectedDestination.value == ReplyRoute.INBOX) {
            ReplyInboxScreen(
                replyHomeUIState = replyHomeUIState,
                closeDetailScreen = closeDetailScreen,
                navaigateToDetail = navigateToDetail,
                modifier = Modifier.weight(1f)
            )
        } else {
            EmptyComingSoon(modifier = Modifier.weight(1f))
        }

        NaviagtionBar(modifier = Modifier.fillMaxWidth()) {
            TOP_LEVEL_DESTINATIONS.forEach{ replyDestination ->
                NavigtionBarItem(
                    selected = selectedDestination == replyDestination.route,
                    onClick = { selectedDestination.value = replyDestination.route },
                    icon = {
                        Icon(
                            imageVector = replyDestination.selectedIcon,
                            contentDescription = stringResource(id = replyDestination.iconTextId)
                        )
                    }
                )
            }
        }
    }
}

object ReplyRoute {
    const val INBOX = "Inbox"
    const val ARTICLES = "Articles"
    const val DM =  "DirecMessages"
    const val GROUPS = "Groups"
}

data class ReplyTopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int
)

val TOP_LEVEL_DESTINATIONS = listOf(
    ReplyTopLevelDestination(
        route = ReplyRoute.INBOX,
        selectedIcon = Icons.Default.Inbox,
        unselectedIcon =  Icons.Default.Inbox,
        iconTextId =  R.string.tab_inbox
    ),
)