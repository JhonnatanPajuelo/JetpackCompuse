package com.jhonnatan.jetpackcompuse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.jhonnatan.jetpackcompuse.ui.theme.JetpackCompuseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCompuseTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                    {
                        MyText()
                    }

                }
            }
        }
    }
//Elementos del preview
@Preview (showBackground = true,name = "Name de my Preview", showSystemUi = true,apiLevel = 33, device = Devices.PIXEL)
@Composable
fun MyText(){
    Text(text = "Hello Jhonnatan")
}

@Composable
fun Greeting( ) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompuseTheme {
        Greeting()
    }
}