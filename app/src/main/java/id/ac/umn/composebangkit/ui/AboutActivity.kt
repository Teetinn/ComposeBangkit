package id.ac.umn.composebangkit.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import id.ac.umn.composebangkit.ui.theme.ComposeBangkitTheme

class AboutActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposeBangkitTheme {
                AboutScreen()
            }
        }
    }
}