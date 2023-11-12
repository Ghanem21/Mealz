package com.example.data.remote

import com.example.domain.entity.response.allMealCategoriesResponse.CategoriesResponse
import retrofit2.http.GET

interface MealsApiService {
    @GET("categories.php")
    suspend fun getAllMealCategories(): CategoriesResponse
}
