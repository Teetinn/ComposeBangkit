package id.ac.umn.composebangkit.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import id.ac.umn.composebangkit.data.StarRail

@Composable
fun ProfileScreen(starRail: StarRail){
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()){
        BoxWithConstraints {
            Surface{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ){
                    ProfileHeader(starRail = starRail, containerHeight = this@BoxWithConstraints.maxHeight)
                    CharacterDetail(starRail = starRail)
                }
            }

        }
    }
}

@Composable
private fun ProfileHeader(
    starRail: StarRail,
    containerHeight: Dp
){
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight/2)
            .fillMaxWidth(),
        painter = painterResource(id = starRail.charaImageId),
        contentScale = ContentScale.Crop,
        contentDescription = "Character Image"
    )
}

@Composable
private fun CharacterDetail(starRail: StarRail){
    Column{
        Name(starRail = starRail)
        CharaDesc(value = starRail.description)
    }
}

@Composable
private fun Name(starRail: StarRail){
    Column(modifier = Modifier.padding(16.dp)){
        Text(
            text = starRail.name,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun CharaDesc(value: String){
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)){
        Divider(modifier = Modifier.padding(bottom = 7.dp))
        Text(
            text = value,
            modifier = Modifier.height(300.dp),
            style = MaterialTheme.typography.body1
        )
    }
}