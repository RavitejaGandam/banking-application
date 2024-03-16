package com.ravi.bankingapplication.controller;

import com.ravi.bankingapplication.entity.BankingEntity;
import com.ravi.bankingapplication.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankDetails")
public class BankingController {
    @Autowired
    BankingService service;

    public BankingController(BankingService service) {
        this.service = service;
    }

    @GetMapping("/allAccounts")
    public List<BankingEntity> getAllAccounts(){
        return service.getAllAccounts();
    }
    @PostMapping("/newAccount")
    public BankingEntity newAccount(@RequestBody BankingEntity entity){
        return service.createAccount(entity);
    }
    @PutMapping("/updateAccount/{id}")
    public BankingEntity updateAccount(@PathVariable Long id, @RequestBody BankingEntity entity){
        return service.updateAccount(id, entity);
    }

    @DeleteMapping("/deleteAccount/{id}")
    public void deleteAccount(@PathVariable Long id){
         service.deleteAccount(id);
    }
}

//GET http://localhost:8080/bankDetails/allAccounts
//POST http://localhost:8080/bankDetails/newAccount
//PUT http://localhost:8080/bankDetails/updateAccount/{id}
//DELETE http://localhost:8080/bankDetails/deleteAccount/{id}