package testmodel.domain;

import java.util.*;
import lombok.*;
import testmodel.domain.*;
import testmodel.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
}
