package testmodel.domain;

import testmodel.InventoryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Inventory_table")
@Data

//<<< DDD / Aggregate Root
public class Inventory  {


    
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Integer stock;

    @PostPersist
    public void onPostPersist(){
    }

    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = InventoryApplication.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }

    public  (){
        //
    }


//<<< Clean Arch / Port Method
    public void update(UpdateCommand updateCommand){
        
        //implement business logic here:
        
        InventoryUpdated inventoryUpdated = new InventoryUpdated(this);
        inventoryUpdated.publishAfterCommit();

    }
//>>> Clean Arch / Port Method

//<<< Clean Arch / Port Method
    public static void updateInventory(OrderPlaced orderPlaced){
        
        //implement business logic here:

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        InventoryUpdated inventoryUpdated = new InventoryUpdated(inventory);
        inventoryUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);

            InventoryUpdated inventoryUpdated = new InventoryUpdated(inventory);
            inventoryUpdated.publishAfterCommit();

         });
        */

        
    }
//>>> Clean Arch / Port Method


}
//>>> DDD / Aggregate Root
