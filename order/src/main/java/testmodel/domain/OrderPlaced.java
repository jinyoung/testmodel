package testmodel.domain;

import java.util.*;
import lombok.*;
import testmodel.domain.*;
import testmodel.infra.AbstractEvent;

@Data
@ToString
@NoArgConstructor
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
