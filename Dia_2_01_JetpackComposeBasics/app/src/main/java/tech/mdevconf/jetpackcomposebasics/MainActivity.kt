package tech.mdevconf.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.mdevconf.jetpackcomposebasics.ui.theme.Dia_2_01_JetpackComposeBasicsTheme

/*
* Views: Elementos gráficos visibles en un diseño de una App (TextView, EditText, Button)
* ViewGroups: Contenedores de Views (LinearLayout, RelativeLatout, ContraintLayout, Coordi...)
* 
* */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaPrincipal()
        }
    }
}

@Composable
fun PantallaPrincipal() {
    // Column, Contenedor que nos permitira alinear nuestros composables internos 
    // de forma lineal verficalmente. (Uno debajo del otro)
    // Row, Contenedor que nos permitira alinear nuestros composabkles internos
    // de forma lineal horizontalmente (Uno al lado de otro)
    
    Dia_2_01_JetpackComposeBasicsTheme {
        Surface(Modifier.fillMaxSize()) {
            //FilaDeTextos()
            //FilaHorizontalTextos()
            ItemLista()
        }
    }
}

@Composable
fun FilaDeTextos() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Hola", fontSize = 30.sp, modifier = Modifier
            .background(Color.Yellow)
            .weight(1F))
        Text(text = "a tod@s", fontSize = 30.sp, modifier = Modifier
            .background(Color.Green)
            .weight(2F))
        Text(text = "mDevConf", fontSize = 30.sp, modifier = Modifier
            .background(Color.Red)
            .weight(3F))
    }
}

@Composable
fun FilaHorizontalTextos() {
    Row(Modifier.fillMaxWidth()) {
        Text(text = "Hola", fontSize = 30.sp, modifier = Modifier
            .background(Color.Yellow)
            .weight(1F))
        Text(text = "a tod@s", fontSize = 30.sp, modifier = Modifier
            .background(Color.Green)
            .weight(2F))
        Text(text = "mDevConf", fontSize = 30.sp, modifier = Modifier
            .background(Color.Red)
            .weight(3F))
    }
}

@Composable
fun ItemLista() {
    Column(Modifier.fillMaxWidth()) {
        ContenidoItem(nombre = "Brais Moure", tituloCharla = "Hola SwiftUI")
        ContenidoItem(nombre = "Antonio Leiva", tituloCharla = "Jetpack Compose")
        ContenidoItem(nombre = "Anahi Salgado", tituloCharla = "State Hoisting")
    }
}

@Composable
fun ContenidoItem(nombre: String, tituloCharla: String) {
    Row(modifier = Modifier.padding(all = 10.dp).fillMaxWidth()) {
        Image(painter = painterResource(id = R.drawable.pngwing),
            contentDescription = "Imagen",
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .border(1.5.dp, Color.Red, RectangleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = nombre, fontSize = 30.sp)
            Text(text = tituloCharla, fontSize = 20.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PantallaPrincipal()
}