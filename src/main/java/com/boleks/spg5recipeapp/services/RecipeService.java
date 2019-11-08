package com.boleks.spg5recipeapp.services;

import com.boleks.spg5recipeapp.commands.RecipeCommand;
import com.boleks.spg5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
