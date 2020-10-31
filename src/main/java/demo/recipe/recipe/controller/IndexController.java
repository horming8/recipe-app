package demo.recipe.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.recipe.recipe.service.RecipeService;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = {"", "/", "/index"})
    public String getPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
