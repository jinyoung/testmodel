package testmodel.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import testmodel.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "findInventories",
    path = "findInventories"
)
public interface FindInventoryRepository
    extends PagingAndSortingRepository<FindInventory, Long> {}
