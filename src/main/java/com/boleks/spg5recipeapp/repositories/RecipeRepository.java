package com.boleks.spg5recipeapp.repositories;

import com.boleks.spg5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
