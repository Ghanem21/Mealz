package com.example.mealzapp.di

import com.example.domain.repo.MealsRepo
import com.example.domain.usecase.MealCategoriesUseCase
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
    fun provideMealCategoriesUseCase(mealsRepo: MealsRepo): MealCategoriesUseCase = MealCategoriesUseCase(mealsRepo)
}
