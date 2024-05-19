package com.jhonnatan.jetpackcompuse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    PeruvianFlag()
                }

            }
        }
    }
}

@Composable
fun ContadorAlPresionar() {
    var conteo by remember { mutableStateOf(0) }
    //Modifier me sirbe para agregarle nuevos atributos al elemento
    Text(text = "Conteo: $conteo".toString(), Modifier.clickable { conteo++ })
}

@Composable
fun MyBox() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Red), contentAlignment = Alignment.Center
    ) {
        Box(
            Modifier
                .background(Color.Gray)
                .width(50.dp)
                .height(50.dp)
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            Text(text = "Hola soy un Focking Box")
        }
    }
}

@Composable
fun HappyBirthday() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Red), Alignment.Center
    ) {
        Text(
            text = "Happy Birthday Valery",
            Modifier
                .background(Color.White)
                .padding(16.dp)
        )

    }
}

@Composable
fun MyColumn() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    )
    {
        Box(
            Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .weight(1f), Alignment.Center
        ) {
            Text(text = "Soy un texto centrado dentro de un Box")
        }
        Box(
            Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .weight(1f), Alignment.Center
        ) {
            Text(text = "Soy un texto centrado dentro de un Box")
        }
        Box(
            Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .weight(1f), Alignment.Center
        ) {
            Text(text = "Soy un texto centrado dentro de un Box")
        }
        Box(
            Modifier
                .background(Color.Yellow)
                .fillMaxWidth(), Alignment.Center
        ) {
            Text(text = "Soy un texto centrado dentro de un Box")
        }
    }
}

@Composable
fun PeruvianFlag() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Box(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp), Alignment.Center){
            Text(text = "Peruvian Flag")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)) {
            Text(
                text = " ",
                Modifier
                    .background(Color.Red)
                    .weight(1f)
                    .height(100.dp)
            )
            Text(
                text = " ",
                Modifier
                    .background(Color.White)
                    .weight(1f)
                    .height(100.dp)
            )
            Text(
                text = " ",
                Modifier
                    .background(Color.Red)
                    .weight(1f)
                    .height(100.dp)
            )
        }
    }
}

@Composable
//Ejercicio 1 de la seccion Layouts en Jetpack Compose
fun Exercise1(){
    Column(Modifier.fillMaxSize()){
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),Alignment.Center){
            Text(text = "Ejemplo1")
        }
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(Modifier.background(Color.Red).fillMaxHeight().weight(1f),Alignment.Center){
                Text(text = "Ejemplo2")
            }
            MySpacerWidth(30)
            Box(Modifier.background(Color.Green).fillMaxHeight().weight(1f),Alignment.Center){
                Text(text = "Ejemplo3")
            }
        }
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Magenta),Alignment.BottomCenter){
            Text(text = "Ejemplo 4")
        }
    }
}

@Composable
fun MySpacerWidth(size:Int){
    Spacer(Modifier.width(size.dp))
}
@Composable
fun MySpacerHeight(size:Int){
    Spacer(Modifier.height(size.dp))
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompuseTheme {
        Exercise1()
    }
}