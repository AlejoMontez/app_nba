package com.example.alejomontez.appnba.CreateAccount.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.alejomontez.appnba.CreateAccount.model.Account;
import com.example.alejomontez.appnba.CreateAccount.presenter.CreateAccountActivityPresenter;
import com.example.alejomontez.appnba.CreateAccount.presenter.CreateAccountActivityPresenterImpl;
import com.example.alejomontez.appnba.Home.view.HomeActivity;
import com.example.alejomontez.appnba.Login.model.Login;
import com.example.alejomontez.appnba.Login.view.LoginActivity;
import com.example.alejomontez.appnba.R;

import java.util.List;

public class CreateAccountActivity extends AppCompatActivity implements CreateAccountActivityView {

    private CreateAccountActivityPresenter createAccountActivityPresenter;
    SharedPreferences sharedPreferences;

    TextInputEditText textInputEditTextid, textInputEditTextEmail, textInputEditTextName, textInputEditTextUser, textInputEditTextPass, textInputEditTextRePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        createAccountActivityPresenter = new CreateAccountActivityPresenterImpl(this);


        textInputEditTextEmail = findViewById(R.id.id_txv_account_email);
        textInputEditTextName = findViewById(R.id.id_txv_account_name);
        textInputEditTextUser = findViewById(R.id.id_txv_account_username);
        textInputEditTextPass = findViewById(R.id.id_txv_account_password);
        textInputEditTextRePass = findViewById(R.id.id_txv_account_repassword);
    }

    public void clickCreateAccount(View view){
        Account account = new Account(

                textInputEditTextUser.getText().toString(),
                textInputEditTextPass.getText().toString(),
                textInputEditTextName.getText().toString(),
                textInputEditTextEmail.getText().toString(),
                textInputEditTextRePass.getText().toString()
        );
        createAccountActivityPresenter.createAccount(account);

        sharedPreferences = getSharedPreferences("PreferencesAppNBA", Context.MODE_PRIVATE);

        // Crear preferencias Clave - Valor
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("email", textInputEditTextEmail.getText().toString());
        editor.putString("name", textInputEditTextName.getText().toString());
        editor.putString("user", textInputEditTextUser.getText().toString());
        editor.putString("password", textInputEditTextPass.getText().toString());
        editor.putBoolean("persistence",true);

        editor.commit();

        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }




    @Override
    public void showResult(List<Account> accountList) {

        sharedPreferences = getSharedPreferences("PreferencesAppNBA", Context.MODE_PRIVATE);

        // Crear preferencias Clave - Valor
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("email", textInputEditTextEmail.getText().toString());
        editor.putString("name", textInputEditTextName.getText().toString());
        editor.putString("user", textInputEditTextUser.getText().toString());
        editor.putString("password", textInputEditTextPass.getText().toString());
        editor.putBoolean("persistence",true);

        editor.commit();

        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
