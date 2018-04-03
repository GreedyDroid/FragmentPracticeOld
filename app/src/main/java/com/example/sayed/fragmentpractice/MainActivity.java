package com.example.sayed.fragmentpractice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String welcomeMessage;
    Bundle msgBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeMessage = "Welcome to First Fragment";
        msgBundle = new Bundle();
        msgBundle.putString("msg", "Welcome To First Fragment");
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FragmentOne fm1 = new FragmentOne();
        fm1.setArguments(msgBundle);
        ft.add(R.id.fragmentContainer, fm1);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void fragmentClicked(View view) {
        Fragment fragment = null;
        switch (view.getId()){
            case R.id.fragmentOne:
                welcomeMessage = "Welcome to First Fragment";
                fragment = new FragmentOne();
                break;
            case R.id.fragmentTwo:
                welcomeMessage = "Welcome to Second Fragment";
                fragment = new FragmentTwo();
                break;
            case R.id.fragmentThree:
                welcomeMessage = "Welcome to Third Fragment";
                fragment = new FragmentThree();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        msgBundle.putString("msg", welcomeMessage);
        fragment.setArguments(msgBundle);
        ft.replace(R.id.fragmentContainer,fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}
