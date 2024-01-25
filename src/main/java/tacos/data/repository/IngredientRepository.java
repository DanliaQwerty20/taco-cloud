package tacos.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import tacos.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository  {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);

}

