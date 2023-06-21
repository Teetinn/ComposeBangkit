package id.ac.umn.composebangkit.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import id.ac.umn.composebangkit.R
import androidx.compose.ui.unit.dp



@Composable
fun AboutScreen(){
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.fillMaxSize()
    ){
        BoxWithConstraints {
            Surface{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                        .padding(top = 180.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally

                ){
                    ProfileImage()
//                    CharacterDetail(starRail = starRail)
                }
            }

        }
    }
}

@Composable
private fun ProfileImage(){
    Image(
        painterResource(id = R.drawable.profilepic),
        contentDescription = "foto diri",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(20.dp)
            .size(250.dp)
            .clip(RoundedCornerShape(corner = CornerSize(50.dp)))

    )

    Text(
        text = "Christine",
        style = MaterialTheme.typography.h5,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(top = 10.dp)
    )
    Text(
        text = "christine1@student.umn.ac.id",
        style = MaterialTheme.typography.body1,
        modifier = Modifier
            .padding(top = 10.dp)
    )

}
