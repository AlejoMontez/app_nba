package com.example.alejomontez.appnba.CreateAccount.interactor;

import com.example.alejomontez.appnba.CreateAccount.model.Account;

import java.util.List;

public interface CreateAccountActivityInteractor {
    void createAccount(Account account);
    void processData(List<Account> accountList);
    void showError(String Error);
}
