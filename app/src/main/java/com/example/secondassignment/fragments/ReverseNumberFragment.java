package com.example.secondassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseNumberFragment extends Fragment {

    Button btnReverseNumber;
    EditText etNumber;



    public ReverseNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate( R.layout.fragment_reverse_number, container, false );

        etNumber = view.findViewById( R.id.etNumber );
        btnReverseNumber = view.findViewById( R.id.btnReverseNumber );

        btnReverseNumber.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num, rev_num=0, lastDigit;
                num = Integer.parseInt( etNumber.getText().toString());

                while(num != 0) {
                    lastDigit = num % 10;
                    rev_num = (rev_num * 10) + lastDigit;
                    num /= 10;
                }
                Toast.makeText( getActivity(), String.valueOf( rev_num ), Toast.LENGTH_SHORT ).show();
            }
        } );

        return view;
    }

}
