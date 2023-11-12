package com.example.domain.usecase

import com.example.domain.entity.response.allMealCategoriesResponse.CategoriesResponse
import com.example.domain.repo.MealsRepo

class GetAllMealCategoriesUseCase(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke(): Result<CategoriesResponse> {
        return try {
            Result.success(mealsRepo.getAllMealCategoriesFromRemote())
        } catch (ex: Exception) {
            Result.failure(ex)
        }
    }
}
