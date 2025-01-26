package br.edu.ifpb.pdm.compose

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.ifpb.pdm.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Artigo(modifier = Modifier.padding(innerPadding))
//                    TaskManager(modifier = Modifier.padding(innerPadding))
                    Quadrantes(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Artigo(modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "header"
        )
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            textAlign = TextAlign.Justify
        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun TaskManager(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = "icon_task_completed"
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(
                top = 24.dp,
                bottom = 8.dp
            ),
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
            modifier = modifier
        )
    }
}

@Composable
fun Quadrantes(modifier: Modifier = Modifier) {
    Column {
        Row {
            Quadro(
                modifier = modifier,
                color = 0xFFEADDFF,
                titulo = "Text composable",
                corpo = "Displays text and follows the recommended Material Design guidelines."
            )
            Quadro(
                modifier = modifier,
                color = 0xFFD0BCFF,
                titulo = "Image composable",
                corpo = "Creates a composable that lays out and draws a given Painter class object."
            )
        }
        Row {
            Quadro(
                modifier = modifier,
                color = 0xFFB69DF8,
                titulo = "Row composable",
                corpo = "A layout composable that places its children in a horizontal sequence."
            )
            Quadro(
                modifier = modifier,
                color = 0xFFF6EDFF,
                titulo = "Column composable",
                corpo = "A layout composable that places its children in a vertical sequence."
            )
        }
    }
}

@Composable
fun Quadro(modifier: Modifier, color: Long, titulo: String, corpo: String) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Color(color)
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(
                bottom = 16.dp
            )
        )
        Text(
            text = corpo,
        )
    }
}