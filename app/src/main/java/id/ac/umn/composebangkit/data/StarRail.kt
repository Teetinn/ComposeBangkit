package id.ac.umn.composebangkit.data

import java.io.Serializable

data class StarRail(
    val id: Int,
    val name: String,
//    val path: String,
//    val element: String,
    val description: String,
    val charaImageId: Int = 0
): Serializable
