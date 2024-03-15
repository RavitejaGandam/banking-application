package com.ravi.bankingapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="accounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankingEntity {
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    Long id;
    String accountHolderName;
    double balance;
}
