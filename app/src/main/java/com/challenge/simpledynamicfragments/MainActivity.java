package com.challenge.simpledynamicfragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new FirstFragment())
                .commit();
    }

    @Override
    public void onFragmentInteraction(String message) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, SecondFragment.newInstance(message)) // replace whatever is in the fragment container with a new fragment
                .addToBackStack(null) // add the transaction to the backStack
                .commit();
    }
}
