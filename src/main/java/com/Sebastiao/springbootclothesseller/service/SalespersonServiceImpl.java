package com.Sebastiao.springbootclothesseller.service;

import com.Sebastiao.springbootclothesseller.model.Salesperson;
import com.Sebastiao.springbootclothesseller.model.Store;
import com.Sebastiao.springbootclothesseller.repository.SalespersonRepository;
import com.Sebastiao.springbootclothesseller.repository.StoreRepository;
import com.Sebastiao.springbootclothesseller.service.SalespersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SalespersonServiceImpl implements SalespersonService{
    private final SalespersonRepository salespersonRepository;

    public SalespersonServiceImpl(SalespersonRepository salespersonRepository)
    {
        this.salespersonRepository = salespersonRepository;
    }

    @Override
    public Salesperson saveSalesperson(Salesperson salesperson)
    {
        salesperson.setCreateTime(LocalDateTime.now());

        return salespersonRepository.save(salesperson);
    }

    @Override
    public void deleteSalesperson(Long id)
    {
        salespersonRepository.deleteById(id);
    }

    @Override
    public List<Salesperson> findAllSalesperson()
    {
        return salespersonRepository.findAll();
    }

}
