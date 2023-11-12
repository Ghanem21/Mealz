package com.example.mealzapp.ui.meals.categories.viewModels

import androidx.lifecycle.ViewModel
import com.example.domain.repo.MealsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MealsCategoriesViewModel @Inject constructor(private val repo: MealsRepo) : ViewModel()
