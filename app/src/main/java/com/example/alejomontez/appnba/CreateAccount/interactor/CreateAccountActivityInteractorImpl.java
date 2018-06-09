package com.example.alejomontez.appnba.CreateAccount.interactor;

import com.example.alejomontez.appnba.CreateAccount.model.Account;
import com.example.alejomontez.appnba.CreateAccount.presenter.CreateAccountActivityPresenter;
import com.example.alejomontez.appnba.CreateAccount.repository.CreateAccountActivityRepository;
import com.example.alejomontez.appnba.CreateAccount.repository.CreateAccountActivityRepositoryImpl;

import java.util.List;

public class CreateAccountActivityInteractorImpl implements CreateAccountActivityInteractor {

    private CreateAccountActivityPresenter createAccountActivityPresenter;
    private CreateAccountActivityRepository createAccountActivityRepository;

    public CreateAccountActivityInteractorImpl(CreateAccountActivityPresenter createAccountActivityPresenter) {
        this.createAccountActivityPresenter = createAccountActivityPresenter;
        createAccountActivityRepository = new CreateAccountActivityRepositoryImpl(this);
    }

    @Override
    public void createAccount(Account account) {
        if ("".equals(account.getUser()) || "".equals(account.getName()) || "".equals(account.getName()) || "".equals(account.getPassword()) || "".equals(account.getRepassword())){
            createAccountActivityPresenter.showError("Los campos no pueden estar vacios");
        }else {
            createAccountActivityRepository.createAccount(account);
        }

    }

    @Override
    public void processData(List<Account> accountList) {

            createAccountActivityPresenter.showResult(accountList);


    }

    @Override
    public void showError(String msg) {
        createAccountActivityPresenter.showError(msg);
    }
}
