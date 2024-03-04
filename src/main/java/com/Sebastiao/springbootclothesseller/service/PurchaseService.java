package com.Sebastiao.springbootclothesseller.service;

import com.Sebastiao.springbootclothesseller.model.Purchase;
import com.Sebastiao.springbootclothesseller.repository.projection.PurchaseItem;

import java.util.List;
public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
