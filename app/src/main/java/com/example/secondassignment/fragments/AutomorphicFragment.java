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

import java.util.Scanner;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment {

    Button btnAutomorphic;
    EditText etAutomorphic;



    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate( R.layout.fragment_automorphic, container, false );
        etAutomorphic = view.findViewById( R.id.etAutomorphic );
        btnAutomorphic = view.findViewById( R.id.btnAutomorphic );

        btnAutomorphic.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt( etAutomorphic.getText().toString() );

                if (isAutomorphic( num ) == true)
                {
                    Toast.makeText( getActivity(), "It is automorphic number", Toast.LENGTH_SHORT ).show();

                }
                else{
                    Toast.makeText( getActivity(), "It is not a automorphic number", Toast.LENGTH_LONG ).show();

                }
            }
        } );

        return view;
    }

    private boolean isAutomorphic(int N)
    {
        int sq = N*N;

        while(N > 0)
        {
            if(N%10 != sq%10) {
                return false;
            }

            N/=10;
            sq/=10;
        }
        return true;
    }

}
