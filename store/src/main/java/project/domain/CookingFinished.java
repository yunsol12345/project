package project.domain;

import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

@Data
@ToString
public class CookingFinished extends AbstractEvent {

    private Long id;
    private String oderId;
    private String storeId;
    private String foodId;
    private String customerId;
    private String status;
    private String address;

    public CookingFinished(Cooking aggregate) {
        super(aggregate);
    }

    public CookingFinished() {
        super();
    }
}
