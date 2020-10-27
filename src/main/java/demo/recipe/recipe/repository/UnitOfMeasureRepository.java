package demo.recipe.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import demo.recipe.recipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

}
