package com.example.navigationapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ConfirmationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String recipient = getArguments().getString("recipient");
        int amount = getArguments().getInt("amount");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_confirmation, container, false);
        TextView tv = view.findViewById(R.id.confirmation_message);
        tv.setText(String.format("$%d was sent to %s", amount, recipient));
        return view;
    }
}