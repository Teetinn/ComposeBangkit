package id.ac.umn.composebangkit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import id.ac.umn.composebangkit.data.StarRail
import id.ac.umn.composebangkit.ui.theme.ComposeBangkitTheme

class ProfileActivity : ComponentActivity() {

    private val starRail : StarRail by lazy{
        intent?.getSerializableExtra(CHARA_ID) as StarRail
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposeBangkitTheme {
                ProfileScreen(starRail = starRail)
            }
        }
    }

    companion object{
        private const val CHARA_ID = "chara_id"
        fun newIntent(context: Context, starRail: StarRail) =
            Intent(context, ProfileActivity::class.java).apply{
                putExtra(CHARA_ID, starRail)
            }
    }
}