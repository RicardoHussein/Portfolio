package com.Sebastiao.springbootclothesseller.service;

//import com.Sebastiao.springbootclothesseller.model.Product;
import com.Sebastiao.springbootclothesseller.model.Salesperson;

import java.util.List;

public interface SalespersonService {
    Salesperson saveSalesperson(Salesperson salesperson);

    void deleteSalesperson(Long id);

    List<Salesperson> findAllSalesperson();
}
