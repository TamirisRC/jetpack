package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAppScreen()
        }
    }
}


@Composable
fun MainAppScreen() {
    JetpackTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ){
            SaudarUsuarioLogado("Tamiris Romano")
        }

    }
}

@Composable
fun SaudarUsuarioLogado(nomeDoUsuarioLogado: String){
    Column {
        Text(text = "Oie, $nomeDoUsuarioLogado!")
        Text("tudo bem?")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPrev() {
    MainAppScreen()
}