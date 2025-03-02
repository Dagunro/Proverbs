package com.example.proverbs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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
        2 -> {

            ProverbsQuote(

                textResourceId = R.string.Epictectus1,
                textResourceIdTwo = R.string.EP,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }
        3 -> {

            ProverbsQuote(

                textResourceId = R.string.MA1,
                textResourceIdTwo = R.string.MA,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }
        4 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_13,
                textResourceIdTwo = R.string.proverbs_02,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        5 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_14,
                textResourceIdTwo = R.string.proverbs_03,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        6 -> {

            ProverbsQuote(

                textResourceId = R.string.Epictectus2,
                textResourceIdTwo = R.string.EP,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        7 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_15,
                textResourceIdTwo = R.string.proverbs_04,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        8 -> {

            ProverbsQuote(

                textResourceId = R.string.Seneca1,
                textResourceIdTwo = R.string.Seneca,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        9 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_16,
                textResourceIdTwo = R.string.proverbs_05,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        10 -> {

            ProverbsQuote(

                textResourceId = R.string.MA2,
                textResourceIdTwo = R.string.MA,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        11 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_17,
                textResourceIdTwo = R.string.proverbs_06,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        12 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_18,
                textResourceIdTwo = R.string.proverbs_07,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        13 -> {

            ProverbsQuote(

                textResourceId = R.string.MA3,
                textResourceIdTwo = R.string.MA,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        14 -> {

            ProverbsQuote(

                textResourceId = R.string.Rumi1,
                textResourceIdTwo = R.string.Rumi,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        15 -> {

            ProverbsQuote(

                textResourceId = R.string.Socrates1,
                textResourceIdTwo = R.string.Socrates,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        16 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_19,
                textResourceIdTwo = R.string.proverbs_08,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        17 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_20,
                textResourceIdTwo = R.string.proverbs_09,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        18 -> {

            ProverbsQuote(

                textResourceId = R.string.Epictectus3,
                textResourceIdTwo = R.string.EP,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        19 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_21,
                textResourceIdTwo = R.string.proverbs_010,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        20 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_22,
                textResourceIdTwo = R.string.proverbs_011,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        21 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_23,
                textResourceIdTwo = R.string.proverbs_012,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        22 -> {

            ProverbsQuote(

                textResourceId = R.string.Epictectus4,
                textResourceIdTwo = R.string.EP,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        23 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_24,
                textResourceIdTwo = R.string.proverbs_013,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        24 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_25,
                textResourceIdTwo = R.string.proverbs_014,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        25 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_26,
                textResourceIdTwo = R.string.proverbs_015,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        26 -> {

            ProverbsQuote(

                textResourceId = R.string.Epictectus5,
                textResourceIdTwo = R.string.EP,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        27 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_27,
                textResourceIdTwo = R.string.proverbs_016,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        28 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_28,
                textResourceIdTwo = R.string.proverbs_017,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        29 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_29,
                textResourceIdTwo = R.string.proverbs_018,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result++
                }
            )
        }

        30 -> {

            ProverbsQuote(

                textResourceId = R.string.proverbs_30,
                textResourceIdTwo = R.string.proverbs_019,
                buttonOne = {
                    result--
                },
                buttonTwo = {
                    result = 1
                },
                buttonThree = {
                    result = 1
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
) {

    Surface(
        modifier = Modifier
//            .fillMaxSize(),

    ) {

        Column(
            modifier = Modifier
                .padding(16.dp),
//                .background(Color.Red),
            verticalArrangement = Arrangement.Center,


            ) {
            Box(
                modifier = Modifier
                    .size(170.dp, 100.dp),
//                    .padding(16.dp),
                contentAlignment = Alignment.TopStart
            ) {

                Text(
                    text = "Proverbs.",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp


                )
            }
            Text(
                text = stringResource(textResourceId),
                color = Color.Gray,
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Thin

            )
            Spacer(modifier = Modifier.height(67.dp))

            Text(
                text = stringResource(textResourceIdTwo),
                color = Color.LightGray,
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Light


            )

//            Spacer(modifier = Modifier.height(100.dp))


        }
    }
    Box(modifier = Modifier.height(790.dp)){

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
//                .background(Color.Yellow),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom

        ) {

            Button(
                onClick = buttonOne,
                colors = ButtonDefaults.textButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "<<",
                    color = Color.Gray,
                    style = MaterialTheme.typography.titleLarge
                )
            }
            Button(
                onClick = buttonTwo,
                colors = ButtonDefaults.textButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "Home",
                    color = Color.Gray,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Button(
                onClick = buttonThree,
                colors = ButtonDefaults.textButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = ">>",
                    color = Color.Gray,
                    style = MaterialTheme.typography.titleLarge
                )
            }
        }
    }
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