package id.ac.umn.composebangkit.ui


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import id.ac.umn.composebangkit.data.DataProvider
import id.ac.umn.composebangkit.data.StarRail

@Composable

fun StarHomeContent(navigateToProfile : (StarRail) -> Unit){
    val starRail = remember{
        DataProvider.starRailList
    }

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = starRail,
            itemContent ={
                StarRailListItem(starRail = it, navigateToProfile)
            }
        )
    }
}

