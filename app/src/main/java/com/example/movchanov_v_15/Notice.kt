package com.example.movchanov_v_15

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movchanov_v_15.ui.theme.Movchanov_v_15Theme

class Notice : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Movchanov_v_15Theme {
                Greeting()
            }
        }
    }

    @Composable
    fun Greeting() {
        var isChecked1 by remember { mutableStateOf(false) }
        var isChecked2 by remember { mutableStateOf(false) }
        var isChecked3 by remember { mutableStateOf(false) }
        val checkboxColors = CheckboxDefaults.colors(
            checkedColor = colorResource(R.color.purple_700)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp) // Reduced padding
        ) {
            // Top section with the image and title
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    contentDescription = "",
                    painter = painterResource(R.drawable.bac),
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(20.dp, 15.dp)
                        .size(30.dp)
                        .clickable {
                            val intent = Intent(applicationContext, PersonalArea::class.java)
                            startActivity(intent)
                        }
                )
                Text(
                    text = "Моё обучение",
                    style = TextStyle(fontSize = 24.sp),
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .offset(0.dp, 15.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp)) // Reduced spacing

            // Image section
            Image(
                contentDescription = "",
                painter = painterResource(R.drawable.section),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )

            Spacer(modifier = Modifier.height(10.dp)) // Reduced spacing

            // Checkbox section
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Показывать прогресс обучения",
                        style = TextStyle(fontSize = 16.sp)
                    )
                    Checkbox(
                        checked = isChecked1,
                        onCheckedChange = { isChecked1 = it },
                        colors = checkboxColors
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Показывать прогресс обучения",
                        style = TextStyle(fontSize = 16.sp)
                    )
                    Checkbox(
                        checked = isChecked2,
                        onCheckedChange = { isChecked2 = it },
                        colors = checkboxColors
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Уведомлять об условиях и акциях",
                        style = TextStyle(fontSize = 16.sp)
                    )
                    Checkbox(
                        checked = isChecked3,
                        onCheckedChange = { isChecked3 = it },
                        colors = checkboxColors
                    )
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Movchanov_v_15Theme {
            Greeting()
        }
    }
}
