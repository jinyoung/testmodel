package testmodel.domain;

import java.util.*;
import lombok.*;
import testmodel.domain.*;
import testmodel.infra.AbstractEvent;

@Data
@ToString
@NoArgConstructor
public class OrderRefused extends AbstractEvent {

    private Long id;

    public OrderRefused(Order aggregate) {
        super(aggregate);
    }

    public OrderRefused() {
        super();
    }
}
