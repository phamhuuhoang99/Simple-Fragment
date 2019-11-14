package com.phamhuuhoang.singlefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get FragmentManager
        FragmentManager fragmentManager=getSupportFragmentManager();

        Fragment fra=fragmentManager.findFragmentById(R.id.fragmentHolder);

        if(fra==null){
            fra=new SingleFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragmentHolder,fra)
                    .commit();

        }


    }
}
