package com.example.navigationapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import org.w3c.dom.Text;

public class SpecifyAmountFragment extends Fragment {

    NavController navController;
    private String recipient;
    private EditText amountInput;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        recipient = getArguments().getString("recipient");
        amountInput = view.findViewById(R.id.input_amount);
        Log.i("INFO", "Recipient is : " + recipient);

        view.findViewById(R.id.cancel_btn).setOnClickListener(v -> getActivity().onBackPressed());

        view.findViewById(R.id.send_btn).setOnClickListener(v ->  {
            String amount = amountInput.getText().toString();
            if (!TextUtils.isEmpty(amount)) {
                Bundle bundle = new Bundle();
                try {
                    bundle.putInt("amount", Integer.parseInt(amount));
                    bundle.putString("recipient", this.recipient);
                    navController.navigate(R.id.action_specifyAmountFragment_to_confirmationFragment, bundle);
                } catch (NumberFormatException ex) {
                    Log.i("INFO", ex.getMessage());
                }
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specify_amount, container, false);
    }
}