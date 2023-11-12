package com.example.mealzapp.di

import com.example.domain.repo.MealsRepo
import com.example.domain.usecase.GetAllMealCategoriesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Singleton
    @Provides
    fun provideGetAllMealCategoriesUseCase(mealsRepo: MealsRepo): GetAllMealCategoriesUseCase = GetAllMealCategoriesUseCase(mealsRepo)
}
