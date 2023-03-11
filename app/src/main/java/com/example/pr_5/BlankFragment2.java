package com.example.pr_5;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class BlankFragment2 extends Fragment {
    private Context context;
    private final int duration = Toast.LENGTH_SHORT;

    private static final String TAG = "BlankFragment2";
    public BlankFragment2() {
        super(R.layout.fragment_blank2);
    }


    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Random r = new Random();
        int randomNumber = (int)(Math.random()*100000);
        TextView ticket = view.findViewById(R.id.ticket);
        ticket.setText(String.valueOf(randomNumber));


        Button button2 = view.findViewById(R.id.buttonToList2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_blankFragment2_to_blankFragment3);
            }
        });
    }
}