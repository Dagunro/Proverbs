package com.example.proverbs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
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

@Composable
fun ProverbsApp(){

    var result by remember { mutableStateOf(1) }

    when(result){

      1 -> {

        ProverbsQuote(

            textResourceId = R.string.proverbs_12,
            textResourceIdTwo = R.string.proverbs_01,
            buttonOne = {
                result = 1
            },
            buttonTwo = {
                result = 1
            },
            buttonThree = {
                result++
            }
        )
      }



    }
}

@Composable
fun ProverbsQuote(
    textResourceId: Int,
    textResourceIdTwo: Int,
    buttonOne: () -> Unit,
    buttonTwo: () -> Unit,
    buttonThree: () -> Unit
)
{



    Surface(
        modifier = Modifier
            .fillMaxSize(),

    ) {
        Box(
            modifier = Modifier
                .size(170.dp, 130.dp)
                .padding(16.dp),
            contentAlignment = Alignment.TopStart
        ){

            Text(
                text = "Proverbs.",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp


            )
        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            verticalArrangement = Arrangement.Center,




        ){
            Text(
                text = stringResource(textResourceId),
                color = Color.DarkGray,
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.Thin

            )
            Spacer(modifier = Modifier.height(67.dp))

            Text(
                text = stringResource(textResourceIdTwo),
                color = Color.LightGray,
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Light



            )

            Spacer(modifier = Modifier.height(100.dp))

            Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){

                Button(
                    onClick = buttonOne,
                    colors = ButtonDefaults.textButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Black
                    )) {
                        Text(text = "<<")
                }
                Button(
                    onClick = buttonTwo,
                    colors = ButtonDefaults.textButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Black
                    )) {
                    Text(text = "Home")
                }
                Button(
                    onClick = buttonThree,
                    colors = ButtonDefaults.textButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Black
                    )) {
                    Text(
                        text = ">>",
                        color = Color.LightGray
                    )
                }

//


            }

        }
    }
    Spacer(modifier = Modifier.height(350.dp))



}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ProverbsAppPreview() {
    ProverbsTheme {
        ProverbsApp()
    }
}