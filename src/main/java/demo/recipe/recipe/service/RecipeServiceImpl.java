package demo.recipe.recipe.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import demo.recipe.recipe.domain.Recipe;
import demo.recipe.recipe.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> set = new HashSet<>();
        recipeRepository.findAll().forEach((i) -> set.add(i));
        return set;
    }

}
