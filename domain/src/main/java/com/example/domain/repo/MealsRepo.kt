package com.example.domain.repo

import com.example.domain.entity.response.allMealCategoriesResponse.CategoriesResponse

interface MealsRepo {
    suspend fun getAllMealCategoriesFromRemote(): CategoriesResponse
}
