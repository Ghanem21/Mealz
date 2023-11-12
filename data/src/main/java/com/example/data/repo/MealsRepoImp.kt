package com.example.data.repo

import com.example.data.remote.MealsApiService
import com.example.domain.entity.response.allMealCategoriesResponse.CategoriesResponse
import com.example.domain.repo.MealsRepo

class MealsRepoImp(private val mealsApiService: MealsApiService) : MealsRepo {
    override suspend fun getAllMealCategoriesFromRemote(): CategoriesResponse =
        mealsApiService.getAllMealCategories()
}
