package com.tts.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tts.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
