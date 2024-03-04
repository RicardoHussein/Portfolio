package com.Sebastiao.springbootclothesseller.repository;

import com.Sebastiao.springbootclothesseller.model.Purchase;
import com.Sebastiao.springbootclothesseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;



public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query("select " +
            "prd.name as name, pur.price as price, pur.purchaseTime as purchaseTime " +
            "from Purchase pur left join Product prd on prd.id = pur.product_id " +
            "where pur.user_id = :user_id")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("user_id") Long userID);


    /**
     @Query("select " +
     "prd.name as name, pur.price as price, pur.purchaseTime as purchaseTime " +
     "from Purchase pur left join Product prd on prd.ID = pur.productID " +
     "where pur.customerID = :customerID")
     List<PurchaseItem> findAllPurchasesOfCustomer(@Param("customerID") Long customerID);
     **/

    /**
     @Query("select " +
     "prd.name as name, pur.price as price, pur.purchaseTime as purchaseTime " +
     "from Purchase pur left join Product prd on prd.ID = pur.productID " +
     "where pur.salespersonID = :salespersonID")
     List<PurchaseItem> findAllPurchasesOfSalesperson(@Param("salespersonID") Long salespersonID);
     **/

    /**
     @Query("select " +
     "prd.name as name, pur.price as price, pur.purchaseTime as purchaseTime " +
     "from Purchase pur left join Product prd on prd.ID = pur.productID " +
     "where pur.storeID = :storeID")
     List<PurchaseItem> findAllPurchasesInStore(@Param("storeID") Long storeID);
     **/
}
