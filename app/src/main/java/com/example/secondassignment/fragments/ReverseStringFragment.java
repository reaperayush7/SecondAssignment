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
public class ReverseStringFragment extends Fragment {


    Button FbtnReverseString;
    EditText etString;



    public ReverseStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate( R.layout.fragment_reverse_string, container, false );

        etString = view.findViewById( R.id.etString );
        FbtnReverseString = view.findViewById( R.id.btnReverseString );

        FbtnReverseString.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unString, reversedString;
                unString = etString.getText().toString();

                StringBuilder sb = new StringBuilder( unString );
                reversedString = sb.reverse().toString();


                Toast.makeText( getActivity(), reversedString, Toast.LENGTH_SHORT ).show();
            }
        } );

        return view;
    }

}
