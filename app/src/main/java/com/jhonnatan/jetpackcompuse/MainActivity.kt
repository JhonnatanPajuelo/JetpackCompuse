package com.jhonnatan.jetpackcompuse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jhonnatan.jetpackcompuse.ui.theme.JetpackCompuseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            JetpackCompuseTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Surface(

                    color = MaterialTheme.colorScheme.background
                )
                {
                    ContadorAlPresionar()
                }

            }
        }
    }
}


@Composable
fun ContadorAlPresionar() {
    var conteo by remember{ mutableStateOf(0) }
    //Modifier me sirbe para agregarle nuevos atributos al elemento
    Text(text = "Conteo: $conteo".toString(),
        Modifier
            .clickable { conteo++ })
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompuseTheme {
        ContadorAlPresionar()
    }
}