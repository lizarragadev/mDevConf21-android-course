package tech.mdevconf.expositores.uibase

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.mdevconf.expositores.model.Speaker

@Composable
fun SpeakerCard(speaker: Speaker, onClick:() -> Unit) {
    Card(
        modifier = Modifier
            .padding(
                bottom = 5.dp,
                top = 5.dp,
                start = 10.dp,
                end = 10.dp
            )
            .fillMaxWidth()
            .clickable(onClick = onClick)
        , shape = RoundedCornerShape(5.dp),
        elevation = 5.dp) {
        Row {
           Image(painter = painterResource(speaker.image), contentDescription = null,
           modifier = Modifier
               .padding(top = 10.dp, bottom = 10.dp, start = 10.dp)
               .height(70.dp)
               .width(70.dp)
               .clip(CircleShape),
           contentScale = ContentScale.Crop)
            Column(modifier = Modifier
                .padding(start = 12.dp)
                .align(Alignment.CenterVertically)) {
                Text(text = speaker.name, fontWeight = FontWeight.Bold, fontSize = 22.sp)
                Text(text = speaker.talk, maxLines = 3, fontSize = 12.sp, modifier = Modifier.padding(end = 20.dp))
            }
        }
    }
}