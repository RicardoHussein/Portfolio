package com.Sebastiao.springbootclothesseller.repository;
import com.Sebastiao.springbootclothesseller.model.Purchase;
import com.Sebastiao.springbootclothesseller.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>{
}
