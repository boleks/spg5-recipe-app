package com.boleks.spg5recipeapp.services;

import com.boleks.spg5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
