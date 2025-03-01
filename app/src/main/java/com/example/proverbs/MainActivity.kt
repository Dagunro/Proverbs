package com.example.proverbs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proverbs.ui.theme.ProverbsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProverbsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (modifier = Modifier.padding(innerPadding)){
                        ProverbsApp()

                    }
                }
            }
        }
    }
}

fun ProverbsApp(){

}

@Composable
fun ProverbsQuote()
{



    Surface(
        modifier = Modifier
            .fillMaxSize(),

    ) {

//        Box(
//            modifier = Modifier
//                .size(230.dp, 23.dp)
//                .background(color = Color.Yellow),
//        ){
//            Text(
//                text = "Proverbs."
//            )
//        }

        Column (
            modifier = Modifier.fillMaxSize().padding(25.dp),
            verticalArrangement = Arrangement.Center


        ){
            Text(
                text = "A person may think their own ways are right, but the Lord weighs the heart.",
                color = Color.DarkGray,
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.Thin

            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Proverbs 2:12",
                color = Color.LightGray,
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Light



            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {}) {
                Text(text = "Previous")
            }
        }
    }
    Spacer(modifier = Modifier.height(350.dp))
    Box(
        modifier = Modifier
            .size(170.dp, 130.dp)
            .padding(16.dp)
            .background(color = Color.Yellow),


        contentAlignment = Alignment.CenterStart
    ){

        Text(
            text = "Proverbs.",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp


        )
    }


}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ProverbsAppPreview() {
    ProverbsTheme {
        ProverbsQuote()
    }
}