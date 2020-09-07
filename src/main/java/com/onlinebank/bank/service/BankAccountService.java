package com.onlinebank.bank.service;

import com.onlinebank.bank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {
    @Autowired
    private final BankRepository bankRepository;

    public BankAccountService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public double setDeposit(double deposited){
        return bankRepository.setDeposit(deposited);
    }
    double setWithdraw(double withdraw){
        return bankRepository.setWithdraw(withdraw);
    }
    public void getLastTransaction(){}
    public void updateAllBalances(){}
    public double setInterestRate(double interestRate) {
        return bankRepository.setInterestRate(interestRate);
    }
}

