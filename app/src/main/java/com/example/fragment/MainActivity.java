package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragment.AreaOfCircle;
import fragment.ArmStrong;
import fragment.Automorphic;
import fragment.Palindrome;
import fragment.SimpleInterest;
import fragment.SwappingNumber;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnArea, btnArmstrong, btnAutomorphic, btnPalindrome, btnSimpleInterest, btnSwapping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnArea = findViewById(R.id.btnArea);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
        btnSwapping = findViewById(R.id.btnSwapping);

        btnArea.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);;
        btnAutomorphic.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSimpleInterest.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.btnArea :
                AreaOfCircle areaOfCircle=new AreaOfCircle();
                fragmentTransaction.replace(R.id.FragmentContainer,areaOfCircle);
                fragmentTransaction.commit();
                break;


            case  R.id.btnArmstrong :
                ArmStrong armStrong=new ArmStrong();
                fragmentTransaction.replace(R.id.FragmentContainer, armStrong);
                fragmentTransaction.commit();
                break;


            case R.id.btnAutomorphic :
                Automorphic automorphic=new Automorphic();
                fragmentTransaction.replace(R.id.FragmentContainer, automorphic);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome :
                Palindrome palindrome=new Palindrome();
                fragmentTransaction.replace(R.id.FragmentContainer, palindrome);
                fragmentTransaction.commit();
                break;

            case R.id.btnSimpleInterest :
                SimpleInterest simpleInterest=new SimpleInterest();
                fragmentTransaction.replace(R.id.FragmentContainer, simpleInterest);
                fragmentTransaction.commit();
                break;

            case  R.id.btnSwapping :
                SwappingNumber swappingNumber=new SwappingNumber();
                fragmentTransaction.replace(R.id.FragmentContainer, swappingNumber);
                fragmentTransaction.commit();
                break;
        }
    }
}
