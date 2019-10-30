package com.boleks.spg5recipeapp.repositories;

import com.boleks.spg5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
