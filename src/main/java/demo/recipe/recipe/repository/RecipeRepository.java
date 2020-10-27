package demo.recipe.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import demo.recipe.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
