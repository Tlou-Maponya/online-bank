package com.onlinebank.bank.repository;

public interface BankRepository {
        double setDeposit(double deposited);
        double setWithdraw(double withdraw);
        void getLastTransaction();
        void updateAllBalances();
        double setInterestRate(double interestRate);
}
