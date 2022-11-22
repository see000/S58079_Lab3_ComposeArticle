package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticleWithBanner()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleWithBanner(title: String = stringResource(R.string.composeTitle),
                             intro: String = stringResource(id = R.string.composeIntro), 
                             body: String = stringResource(id = R.string.composeBody)) {
    Column() {
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(
            painter = image ,
            contentDescription = null,
            modifier =  Modifier
                .fillMaxWidth()

        )
        Text(
            text = title,
            modifier = Modifier
                .padding(all = 16.dp),
            textAlign = TextAlign.Justify,
            fontSize = 24.sp

        )
        Text(
            text = intro,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign =  TextAlign.Justify,


        )
        Text(
            text = body,
            modifier = Modifier
                .padding(all = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        ComposeArticleWithBanner()
    }
}