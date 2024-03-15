package com.ravi.bankingapplication.service;

import com.ravi.bankingapplication.entity.BankingEntity;
import com.ravi.bankingapplication.repository.BankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements BankingService{
    @Autowired
    private BankingRepository repo;
    public ServiceImpl(BankingRepository repo) {
        this.repo = repo;
    }
    @Override
    public BankingEntity createAccount(BankingEntity entity) {
        return repo.save(entity);
    }

    @Override
    public List<BankingEntity> getAllAccounts() {
        return repo.findAll();
    }

    @Override
    public BankingEntity updateAccount(Long id, BankingEntity entity) {
        BankingEntity bank = repo.findById(id)
                .orElseThrow(()-> new RuntimeException("Id not found"));
        bank.setAccountHolderName(entity.getAccountHolderName());
        bank.setBalance(entity.getBalance());
        return repo.save(bank);
    }

    @Override
    public String deleteAccount(Long id) {
        repo.deleteById(id);
        return "The provided :  " +id+ "has been deleted";
    }

}
