package tacos.convert;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.data.repository.IngredientRepository;
import tacos.model.Ingredient;

@Component
public class IngredientByIdConverter implements Converter<String, Optional<Ingredient>> {
    private IngredientRepository ingredientRepo;
    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }
    @Override
    public Optional<Ingredient> convert(String id) {
        return ingredientRepo.findById(id);
    }

}