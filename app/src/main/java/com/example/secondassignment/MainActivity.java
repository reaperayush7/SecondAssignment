package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassignment.fragments.AreaOfCircleFragment;
import com.example.secondassignment.fragments.AutomorphicFragment;
import com.example.secondassignment.fragments.PalindromeFragment;
import com.example.secondassignment.fragments.ReverseNumberFragment;
import com.example.secondassignment.fragments.ReverseStringFragment;
import com.example.secondassignment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button MainbtnSum, MainbtnArea, MainbtnAutomorphic, MainbtnPalindrome, MainbtnReverseString, MainbtnReverseNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        MainbtnSum = findViewById( R.id.MainbtnSum );
        MainbtnArea = findViewById( R.id.MainbtnArea );
        MainbtnAutomorphic = findViewById( R.id.MainbtnAutomorphic );
        MainbtnPalindrome = findViewById( R.id.MainbtnPalindrome );
        MainbtnReverseString = findViewById( R.id.MainbtnReverseString );
        MainbtnReverseNumber = findViewById( R.id.MainbtnReverseNumber );

        MainbtnSum.setOnClickListener( this );
        MainbtnArea.setOnClickListener( this );
        MainbtnAutomorphic.setOnClickListener( this );
        MainbtnPalindrome.setOnClickListener( this );
        MainbtnReverseString.setOnClickListener( this );
        MainbtnReverseNumber.setOnClickListener( this );

    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        switch (v.getId()){

            case R.id.MainbtnSum: {
                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace( R.id.fragmentContainer, sumFragment );
                fragmentTransaction.commit();
                break;
            }

            case R.id.MainbtnArea:{
                AreaOfCircleFragment areaOfCircleFragment = new AreaOfCircleFragment();
                fragmentTransaction.replace( R.id.fragmentContainer, areaOfCircleFragment );
                fragmentTransaction.commit();
                break;
            }


            case R.id.MainbtnPalindrome: {
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace( R.id.fragmentContainer, palindromeFragment );
                fragmentTransaction.commit();
                break;
            }


            case R.id.MainbtnReverseString: {
                ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                fragmentTransaction.replace( R.id.fragmentContainer, reverseStringFragment );
                fragmentTransaction.commit();
                break;
            }


            case R.id.MainbtnReverseNumber: {
                ReverseNumberFragment reverseNumberFragment = new ReverseNumberFragment();
                fragmentTransaction.replace( R.id.fragmentContainer, reverseNumberFragment );
                fragmentTransaction.commit();
                break;
            }


            case R.id.MainbtnAutomorphic: {
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace( R.id.fragmentContainer, automorphicFragment );
                fragmentTransaction.commit();
                break;
            }
        }

    }
}
