package tacos.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Table
@AllArgsConstructor
@Setter
@Getter
public class Ingredient implements Persistable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private final String name;
    private final Type type;

    @Override
    public boolean isNew() {
        return false;
    }

    public enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE;
    }
}
