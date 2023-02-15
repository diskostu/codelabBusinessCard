package de.diskostu.codelab.codelabbusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.diskostu.codelab.codelabbusinesscard.ui.theme.CodelabBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodelabBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    AllTogetherNow()
                }
            }
        }
    }
}


@Composable
fun AllTogetherNow() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TitlePicture(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 48.dp)
        )
        NameAndTitle(
            modifier = Modifier
                .align(Alignment.Center)
        )
        ContactLines(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 36.dp)
        )
    }
}


@Composable
fun TitlePicture(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.email_black_24dp),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier
            .size(150.dp)
    )
}


@Composable
fun NameAndTitle(modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "Full name",
            fontSize = 48.sp
        )
        Text(
            text = "Title",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun ContactLine(text: String) {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.email_black_24dp),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            fontSize = 16.sp
        )
    }
}


@Composable
fun ContactLines(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        ContactLine(text = "lala@gmail.com")
        ContactLine(text = "someother@gmail.com")
        ContactLine(text = "heythere@gmail.com")
    }
}