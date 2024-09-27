package com.fisi.a30daysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fisi.a30daysapp.data.Datasource
import com.fisi.a30daysapp.model.Receta
import com.fisi.a30daysapp.ui.theme._30DaysAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Text(
                        text = "30 Dias de Cocina",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(top = 40.dp, bottom = 12.dp)
                            .fillMaxSize()
                    )
                    RecetasApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun CardReceta(receta: Receta, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(horizontal = 36.dp, vertical = 12.dp)
            .fillMaxSize()
    ) {
        Column(modifier = modifier) {
            Text(
                text = LocalContext.current.getString(receta.date),
                modifier = Modifier.padding(start = 12.dp, top = 5.dp)
            )
            Text(
                text = LocalContext.current.getString(receta.titleResourceId),
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 8.dp)
            )
            Image(
                painter = painterResource(id = receta.imageResourceId),
                contentDescription = stringResource(receta.titleResourceId),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = LocalContext.current.getString(receta.ingredientsResourceId),
                modifier = Modifier
                    .padding(horizontal = 22.dp, vertical = 15.dp)
                    .fillMaxSize()
            )
        }
    }
}

@Composable
fun ListReceta(listreceta: List<Receta>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(listreceta) { receta ->
            CardReceta(receta = receta)
        }
    }
}

@Composable
fun RecetasApp(modifier: Modifier = Modifier) {
    ListReceta(listreceta = Datasource().loadRecetas(), modifier = modifier.padding(top = 50.dp))
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    _30DaysAppTheme {
        CardReceta(Receta(R.string.dia1, R.string.title1, R.drawable.image1, R.string.ingredients1))
    }
}
