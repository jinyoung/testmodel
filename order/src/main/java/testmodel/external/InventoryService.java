package testmodel.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "inventory", url = "${api.url.inventory}")
public interface InventoryService {
    @RequestMapping(
        method = RequestMethod.PUT,
        path = "/inventories/{id}/update"
    )
    public void update(
        @PathVariable("id") Long id,
        @RequestBody UpdateCommand updateCommand
    );
}
