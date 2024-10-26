package com.sem.balelas.ui.screen.feed

import androidx.lifecycle.ViewModel
import com.sem.balelas.ui.screen.feed.state.NewsList
import com.sem.balelas.ui.screen.feed.state.NewsListState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class NewsFeedViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(NewsListState(listNews = listOf()))
    val uiState: StateFlow<NewsListState> = _uiState.asStateFlow()

    init {
        _uiState.update { state ->
            state.copy(listNews = listOf(
                NewsList(
                    articleId = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
                    title = "Peter Todd Was ‘Unmasked’ As Bitcoin Creator Satoshi Nakamoto. Now He’s In Hiding",
                    imageUrl = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
                ),
                NewsList(
                    articleId = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
                    title = "Peter Todd Was ‘Unmasked’ As Bitcoin Creator Satoshi Nakamoto. Now He’s In Hiding",
                    imageUrl = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
                ),
                NewsList(
                    articleId = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
                    title = "Peter Todd Was ‘Unmasked’ As Bitcoin Creator Satoshi Nakamoto. Now He’s In Hiding",
                    imageUrl = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
                ),
                NewsList(
                    articleId = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
                    title = "Peter Todd Was ‘Unmasked’ As Bitcoin Creator Satoshi Nakamoto. Now He’s In Hiding",
                    imageUrl = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
                ),
                NewsList(
                    articleId = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
                    title = "Peter Todd Was ‘Unmasked’ As Bitcoin Creator Satoshi Nakamoto. Now He’s In Hiding",
                    imageUrl = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
                ),
                NewsList(
                    articleId = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
                    title = "Peter Todd Was ‘Unmasked’ As Bitcoin Creator Satoshi Nakamoto. Now He’s In Hiding",
                    imageUrl = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
                )
            ))
        }
    }
}
