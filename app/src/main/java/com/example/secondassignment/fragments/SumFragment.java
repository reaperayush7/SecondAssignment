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
public class SumFragment extends Fragment {

    Button btnAdd;
    EditText etFirst, etSecond;

    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_sum, container, false );

        etFirst = view.findViewById( R.id.etFirst );
        etSecond = view.findViewById( R.id.etSecond );
        btnAdd = view.findViewById( R.id.btnSum );

        btnAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, sum;
                first = Integer.parseInt( etFirst.getText().toString());
                second = Integer.parseInt( etSecond.getText().toString());

                sum = first + second;
                Toast.makeText( getActivity(), String.valueOf( sum ), Toast.LENGTH_SHORT ).show();
            }
        } );

        return view;
    }

}
