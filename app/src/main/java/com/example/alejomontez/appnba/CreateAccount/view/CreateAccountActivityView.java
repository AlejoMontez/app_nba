package com.example.alejomontez.appnba.CreateAccount.view;


import com.example.alejomontez.appnba.CreateAccount.model.Account;
import com.example.alejomontez.appnba.Login.model.Login;

import java.util.List;

public interface CreateAccountActivityView {
    void showResult(List<Account> accountList);
    void showError(String Error);
}
