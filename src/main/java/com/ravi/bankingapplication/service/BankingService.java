package com.ravi.bankingapplication.service;

import com.ravi.bankingapplication.entity.BankingEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankingService {

    BankingEntity createAccount(BankingEntity entity);
    List<BankingEntity> getAllAccounts();
    BankingEntity updateAccount(Long id, BankingEntity entity);
    String deleteAccount(Long id);
}
