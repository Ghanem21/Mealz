package com.example.domain.entity.response.allMealCategoriesResponse

import com.squareup.moshi.Json

data class Category(
    @Json(name = "idCategory")
    val id: String,
    @Json(name = "strCategory")
    val name: String,
    @Json(name = "strCategoryDescription")
    val description: String,
    @Json(name = "strCategoryThumb")
    val imageUrl: String,
)
