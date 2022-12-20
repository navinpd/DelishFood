package com.example.delishfood.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delishfood.R
import com.example.delishfood.ui.theme.DelishFoodTheme

@Composable
fun BookmarkCardView() {
    Column(
        modifier = Modifier
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Custom Image",
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .fillMaxWidth(0.9f)
            )
        }
        Text(text = "45 Min")
        Text(text = "Banana, Cucumber", fontWeight = FontWeight.Bold)
        Text(text = "by Foodista")
    }
}

@Preview
@Composable
fun BookmarkPreview() {
    DelishFoodTheme {
        BookmarkCardView()
    }
}