package testmodel.domain;

import java.util.*;
import lombok.*;
import testmodel.domain.*;
import testmodel.infra.AbstractEvent;

@Data
@ToString
@NoArgConstructor
public class InventoryUpdated extends AbstractEvent {

    private Long id;

    public InventoryUpdated(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryUpdated() {
        super();
    }
}
