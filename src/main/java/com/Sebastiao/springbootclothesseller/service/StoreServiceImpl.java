package com.Sebastiao.springbootclothesseller.service;

import com.Sebastiao.springbootclothesseller.model.Store;
import com.Sebastiao.springbootclothesseller.repository.StoreRepository;
import com.Sebastiao.springbootclothesseller.service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{
    private final StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository)
    {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store saveStore(Store store)
    {
        store.setCreateTime(LocalDateTime.now());

        return storeRepository.save(store);
    }

    @Override
    public void deleteStore(Long id)
    {
        storeRepository.deleteById(id);
    }

    @Override
    public List<Store> findAllStores()
    {
        return storeRepository.findAll();
    }

}
