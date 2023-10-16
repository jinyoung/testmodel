package testmodel.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FindInventory_table")
@Data
public class FindInventory {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
