package testmodel.domain;

import java.util.*;
import lombok.*;
import testmodel.domain.*;
import testmodel.infra.AbstractEvent;

@Data
@ToString
public class InventoryUpdated extends AbstractEvent {

    private Long id;
    private Integer stock;

    public InventoryUpdated(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryUpdated() {
        super();
    }
}
