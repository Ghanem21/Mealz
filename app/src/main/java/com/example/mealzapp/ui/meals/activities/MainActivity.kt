package com.example.mealzapp.ui.meals.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mealzapp.ui.meals.categories.screens.MealsCategoriesScreen
import com.example.mealzapp.ui.meals.categories.viewModels.MealsCategoriesViewModel
import com.example.mealzapp.ui.theme.MealzAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealzAppTheme {
                val viewModel: MealsCategoriesViewModel = hiltViewModel()
                MealsCategoriesScreen(viewModel)
            }
        }
    }
}
