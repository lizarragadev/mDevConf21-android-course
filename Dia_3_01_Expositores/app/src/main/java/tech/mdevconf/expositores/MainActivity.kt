package tech.mdevconf.expositores

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import tech.mdevconf.expositores.model.Speaker
import tech.mdevconf.expositores.ui.theme.Dia_3_01_ExpositoresTheme
import tech.mdevconf.expositores.uibase.SpeakerCard
import tech.mdevconf.expositores.viewmodel.SpeakerViewModel

class MainActivity : ComponentActivity() {

    private val speakerView: SpeakerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowList()
        }
    }

    @Composable
    fun ShowList() {
        Dia_3_01_ExpositoresTheme {
            val speakerData = speakerView.speakerList.value
            speakerData?.let { SetSpeakerList(speakerList = it) }
        }
    }
    
    @Composable
    fun SetSpeakerList(speakerList: List<Speaker>) {
        LazyColumn {
            itemsIndexed(items = speakerList) { index, itemSpeaker ->
                SpeakerCard(speaker = itemSpeaker, onClick = {
                    Toast.makeText(applicationContext,
                        "Hizo click en ${itemSpeaker.name}",
                        Toast.LENGTH_LONG).show()
                })
            }
        }
    }
    
    @Preview
    @Composable
    fun ListPreview(){
        ShowList()
    }
}