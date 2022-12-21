package com.example.delishfood.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delishfood.R
import com.example.delishfood.ui.theme.DelishFoodTheme

@Composable
fun BookmarkGrid() {
    LazyVerticalGrid(columns = GridCells.Fixed(2), content = {
        items(6) {
            BookmarkCardView {

            }
        }
    })
}

@Composable
fun BookmarkCardView(bookmarkClick: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(8.dp),
    ) {
        Box(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Custom Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(15.dp)),
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .size(64.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(35.dp))
                    .background(color = Color.Yellow)
                    .clickable(onClick = bookmarkClick)
            )
        }
        Text(
            text = "45 Min",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(horizontal = 8.dp)
        )
        Text(
            text = "Banana, Cucumber, Millet, Brown",
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(horizontal = 8.dp)
        )
        Text(
            text = "by Foodista",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(horizontal = 8.dp)
        )
    }
}

@Preview
@Composable
fun LazyBookmarkView() {
    BookmarkGrid()
}

@Preview
@Composable
fun BookmarkPreview() {
    DelishFoodTheme {
        BookmarkCardView({})
    }
}