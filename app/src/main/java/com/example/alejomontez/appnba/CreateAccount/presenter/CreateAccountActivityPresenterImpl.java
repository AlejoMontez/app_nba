package com.example.alejomontez.appnba.CreateAccount.presenter;


import com.example.alejomontez.appnba.CreateAccount.interactor.CreateAccountActivityInteractor;
import com.example.alejomontez.appnba.CreateAccount.interactor.CreateAccountActivityInteractorImpl;
import com.example.alejomontez.appnba.CreateAccount.model.Account;
import com.example.alejomontez.appnba.CreateAccount.view.CreateAccountActivityView;

import java.util.List;

public class CreateAccountActivityPresenterImpl implements CreateAccountActivityPresenter {

    private CreateAccountActivityView createAccountActivityView;
    private CreateAccountActivityInteractor createAccountActivityInteractor;

    public CreateAccountActivityPresenterImpl(CreateAccountActivityView createAccountActivityView) {
        this.createAccountActivityView = createAccountActivityView;
        createAccountActivityInteractor = new CreateAccountActivityInteractorImpl(this);
    }

    @Override
    public void createAccount(Account account) {
        createAccountActivityInteractor.createAccount(account);
    }

    @Override
    public void showResult(List<Account> accountList) {
        createAccountActivityView.showResult(accountList);
    }

    @Override
    public void showError(String msg) {
        createAccountActivityView.showError(msg);
    }
}