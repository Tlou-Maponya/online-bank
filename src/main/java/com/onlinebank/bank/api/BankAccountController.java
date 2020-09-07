package com.onlinebank.bank.api;

import com.onlinebank.bank.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("api/user")
@RestController
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping(path = "deposit")
    public double setDeposit(@RequestBody double deposit) {
        return bankAccountService.setDeposit(deposit);
    }

    @PostMapping(path = "withdraw")
    public double setWithdraw(@RequestBody double withdraw) {
        return bankAccountService.setWithdraw();
    }


    @GetMapping(path = "transaction")
    public void getLastTransaction() {
        bankAccountService.getLastTransaction();
    }

    @PutMapping(path = "bankcharges")
    public void updateAllBalances() {
        bankAccountService.updateAllBalances();
    }
}

