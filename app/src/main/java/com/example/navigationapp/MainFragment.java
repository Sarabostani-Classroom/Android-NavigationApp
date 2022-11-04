package com.example.navigationapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment implements View.OnClickListener {

    NavController navController;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.send_money_btn).setOnClickListener(this);
        view.findViewById(R.id.view_transactions_btn).setOnClickListener(this);
        view.findViewById(R.id.view_balance_btn).setOnClickListener(this);

        navController = Navigation.findNavController(view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.send_money_btn :
                navController.navigate(R.id.action_mainFragment_to_chooseRecipientFragment);
                break;
            case R.id.view_transactions_btn:
                navController.navigate(R.id.action_mainFragment_to_viewTransactionFragment);
                break;
            case R.id.view_balance_btn:
                navController.navigate(R.id.action_mainFragment_to_viewBalanceFragment);
        }
    }
}