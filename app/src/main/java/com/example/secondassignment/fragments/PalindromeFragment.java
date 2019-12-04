package com.example.secondassignment.fragments;

import android.content.Context;
import android.net.Uri;
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
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class PalindromeFragment extends Fragment {

    Button btnPalindrome;
    EditText etPalindromeNumber;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_palindrome, container, false );

        etPalindromeNumber = view.findViewById( R.id.etPalindromeNumber );
        btnPalindrome = view.findViewById( R.id.btnPalindrome );

        btnPalindrome.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num, reverse, lastDigit;
                num = Integer.parseInt( etPalindromeNumber.getText().toString() );
                reverse = reverse( num );



                if (num == reverse) {
                    Toast.makeText( getActivity(), "It is Palindrome", Toast.LENGTH_SHORT ).show();
                } else {
                    Toast.makeText( getActivity(), "It is not Palindrome", Toast.LENGTH_SHORT ).show();
                }
            }
        } );

        return view;
    }

    private int reverse(int num)
    {
        int result = 0, lastDigit;

        while(num != 0) {
            lastDigit = num % 10;
            result = (result * 10) + lastDigit;
            num /= 10;
        }
        return result;


    }

}


