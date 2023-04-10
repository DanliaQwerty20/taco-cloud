package tacos;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
//класс,который будет предоставлять заказы,которые клиенты будут оставлять на сайте
@Data
public class TacoOrder {
    private String deliveryName;
    private String deliverySreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos=new ArrayList<>();

    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }

}
