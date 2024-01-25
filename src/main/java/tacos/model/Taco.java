package tacos.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import tacos.model.Ingredient;

import java.util.Date;
import java.util.List;

@Data
@Table
public class Taco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt=new Date();
    @NotNull
    @Size(min=5,message = "Name must be at least 5 characters long")
    private String name;
    @ManyToOne
    @JoinColumn(name = "taco_order_id", referencedColumnName = "id")
    private TacoOrder tacoOrder;
    @NotNull
    @Size(min=1,message = "You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients;


}
