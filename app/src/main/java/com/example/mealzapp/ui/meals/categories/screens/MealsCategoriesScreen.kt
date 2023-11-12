package com.example.mealzapp.ui.meals.categories.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mealzapp.ui.meals.categories.viewModels.MealsCategoriesViewModel
import com.example.mealzapp.ui.theme.MealzAppTheme

@Composable
fun MealsCategoriesScreen(
    viewModel: MealsCategoriesViewModel,
) {
    Text(
        text = "Hello Compose!",
    )
}

@Preview(showBackground = true)
@Composable
fun MealsCategoriesScreenPreview() {
    MealzAppTheme {
        val viewModel = hiltViewModel<MealsCategoriesViewModel>()
        MealsCategoriesScreen(viewModel)
    }
}
