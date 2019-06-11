package com.tts.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tts.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
