package com.example.alejomontez.appnba.CreateAccount.presenter;

import com.example.alejomontez.appnba.CreateAccount.model.Account;

import java.util.List;

public interface CreateAccountActivityPresenter {
    void createAccount(Account account);
    void showResult(List<Account> accountList);
    void showError(String Error);
}
