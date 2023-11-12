package com.example.data.repo

import com.example.domain.entity.response.allMealCategoriesResponse.CategoriesResponse
import com.example.domain.repo.MealsRepo

class MealsRepoStub : MealsRepo {
    override suspend fun getAllMealCategoriesFromRemote(): CategoriesResponse {
        throw Exception("stub method")
    }
}
