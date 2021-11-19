package tech.mdevconf.expositores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import tech.mdevconf.expositores.viewmodel.SpeakerViewModel

class MainActivity : ComponentActivity() {

    private val speakerView: SpeakerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

    @Preview
    @Composable
    fun ListPreview(){

    }
}