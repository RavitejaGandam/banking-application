package com.ravi.bankingapplication.repository;

import com.ravi.bankingapplication.entity.BankingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankingRepository extends JpaRepository<BankingEntity,Long> {
}
