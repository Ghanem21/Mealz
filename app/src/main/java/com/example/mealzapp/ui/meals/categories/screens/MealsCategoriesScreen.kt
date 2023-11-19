package com.example.mealzapp.ui.meals.categories.screens

import android.widget.Toast
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mealzapp.ui.meals.categories.viewModels.MealsCategoriesViewModel
import com.example.mealzapp.ui.theme.MealzAppTheme
import kotlinx.coroutines.launch

@Composable
fun MealsCategoriesScreen(
    viewModel: MealsCategoriesViewModel,
) {
    val coroutineScope = rememberCoroutineScope()
    Text(
        text = "Hello Compose!",
    )
    val context = LocalContext.current
    coroutineScope.launch {
        viewModel.categories.collect {
            Toast.makeText(context, it.size.toString(), Toast.LENGTH_LONG).show()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MealsCategoriesScreenPreview() {
    MealzAppTheme {
        val viewModel = hiltViewModel<MealsCategoriesViewModel>()
        MealsCategoriesScreen(viewModel)
    }
}
