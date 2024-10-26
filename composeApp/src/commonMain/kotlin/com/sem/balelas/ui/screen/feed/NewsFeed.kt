package com.sem.balelas.ui.screen.feed

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sem.balelas.ui.components.NewsFeedCard
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun NewsFeed() {
    NewsFeedScreen(
        modifier = Modifier.padding(top = 44.dp)
    )
}

@Composable
fun NewsFeedScreen(
    modifier: Modifier,
    viewModel: NewsFeedViewModel = viewModel { NewsFeedViewModel() }
) {
    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(viewModel.uiState.value.listNews) { news ->
            NewsFeedCard(news)
        }
    }
}

@Preview
@Composable
fun NewsFeedPreview() {
    NewsFeed()
}
