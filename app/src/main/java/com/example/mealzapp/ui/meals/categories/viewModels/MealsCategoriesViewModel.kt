package com.example.mealzapp.ui.meals.categories.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.response.allMealCategoriesResponse.Category
import com.example.domain.usecase.MealCategoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MealsCategoriesViewModel @Inject constructor(private val mealCategoriesUseCase: MealCategoriesUseCase) :
    ViewModel() {
    private val categoriesStateFlow = MutableSharedFlow<List<Category>>()
    val categories: SharedFlow<List<Category>> = categoriesStateFlow

    init {
        getAllMealCategories()
    }

    private fun getAllMealCategories() = viewModelScope.launch {
        val result = mealCategoriesUseCase()
        result.onSuccess {
            categoriesStateFlow.emit(it.categories)
        }.onFailure {
            Timber.e("Exception ${it.localizedMessage}")
        }
    }

}
