package tacos.data.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.model.TacoOrder;

public interface OrderRepository  {
    TacoOrder save(TacoOrder order);
}
