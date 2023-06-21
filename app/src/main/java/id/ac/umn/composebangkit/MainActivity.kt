package id.ac.umn.composebangkit

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White
import id.ac.umn.composebangkit.data.StarRail
import id.ac.umn.composebangkit.ui.AboutActivity
import id.ac.umn.composebangkit.ui.ProfileActivity
import id.ac.umn.composebangkit.ui.StarHomeContent
import id.ac.umn.composebangkit.ui.theme.ComposeBangkitTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBangkitTheme {
                MyApp {
                    startActivity(ProfileActivity.newIntent(this, it))
                }
            }
        }
    }
    @Composable
    fun MyApp(navigateToProfile: (StarRail) -> Unit){
        Scaffold(
            topBar = { TopAppBar(
                title = {Text("Honkai Star Rail Wiki")},
                backgroundColor = White,
                actions = {
                    IconButton(onClick = {
                        val navigate = Intent(this@MainActivity, AboutActivity::class.java)
                        startActivity(navigate)
                    }) {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "about_page")
                    }
                }
            )  },
            content = {
                StarHomeContent(navigateToProfile = navigateToProfile)
            }
        )
    }
}



