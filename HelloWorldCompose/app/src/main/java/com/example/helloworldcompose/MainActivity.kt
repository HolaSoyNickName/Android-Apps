package com.example.helloworldcompose

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworldcompose.ui.theme.HelloWorldComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HelloApp() {
    HelloWorldComposeTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Greeting("Android")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExampleModifier() {
    Text(text = "Suscribete", modifier = Modifier.padding( 16.dp))
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Text(
        text = "Hello COMO ESTAS CARA DE BOLA $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWorldComposeTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true, name = "SOY EL PEPE")
@Composable
fun SecondPreview() {
    HelloWorldComposeTheme {
        Greeting("pepe XD")
    }
}