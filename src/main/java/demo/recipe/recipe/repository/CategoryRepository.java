package demo.recipe.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import demo.recipe.recipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
