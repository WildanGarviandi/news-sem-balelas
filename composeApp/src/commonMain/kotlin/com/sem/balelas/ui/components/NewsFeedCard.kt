package com.sem.balelas.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.sem.balelas.ui.screen.feed.state.NewsList
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun NewsFeedCard(news: NewsList) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(Color.White.copy(alpha = 0.1f))
            .border(
                width = 1.dp,
                color = Color.Transparent,
                shape = RoundedCornerShape(15.dp)
            )
            .padding(16.dp)
    ) {
        AsyncImage(
            modifier = Modifier,
            model = news.imageUrl,
            contentDescription = "",
            contentScale = ContentScale.FillBounds
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(news.title, fontSize = 24.sp, color = Color.White)
        }
    }
}


@Composable
@Preview
fun NewsFeedCardPreview() {
    NewsFeedCard(NewsList(
        articleId = "",
        title = "",
        imageUrl = ""
    ))
}
