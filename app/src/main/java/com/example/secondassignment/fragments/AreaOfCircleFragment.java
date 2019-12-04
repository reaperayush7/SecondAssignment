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
public class AreaOfCircleFragment extends Fragment {

    Button btnArea;
    EditText etRadius;


    public AreaOfCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_area_of_circle, container, false );

        etRadius = view.findViewById( R.id.etRadius );
        btnArea = view.findViewById( R.id.btnCalculateArea );

        btnArea.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float radius, ans;
                radius = Integer.parseInt( etRadius.getText().toString());

                ans = Float.parseFloat( String.valueOf( Math.PI * radius * radius ) );
                Toast.makeText( getActivity(), String.valueOf( ans ), Toast.LENGTH_SHORT ).show();
            }
        } );

        return view;
    }

}
