package com.Sebastiao.springbootclothesseller.service;

//import com.Sebastiao.springbootclothesseller.model.Salesperson;
import com.Sebastiao.springbootclothesseller.model.Store;

import java.util.List;

public interface StoreService {
    Store saveStore(Store store);

    void deleteStore(Long id);

    List<Store> findAllStores();
}
