package com.example.lastsoul.tut1;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lastsoul.tut1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.b0.setOnClickListener(this);
        binding.b1.setOnClickListener(this);
        binding.b1.setOnClickListener(this);
        binding.b2.setOnClickListener(this);
        binding.b3.setOnClickListener(this);
        binding.b4.setOnClickListener(this);
        binding.b5.setOnClickListener(this);
        binding.b6.setOnClickListener(this);
        binding.b7.setOnClickListener(this);
        binding.b8.setOnClickListener(this);
        binding.b9.setOnClickListener(this);

        binding.bmul.setOnClickListener(this);
        binding.bplu.setOnClickListener(this);
        binding.bdiv.setOnClickListener(this);
        binding.bdot.setOnClickListener(this);
        binding.bsub.setOnClickListener(this);
        binding.bc.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.b0:

            break;

            case R.id.b1:

                break;

            case R.id.b2:

                break;

            case R.id.b3:

                break;

            case R.id.b4:

                break;

            case R.id.b5:

                break;

            case R.id.b6:

                break;

            case R.id.b7:

                break;

            case R.id.b8:

                break;

            case R.id.b9:

                break;

            case R.id.bmul:

                break;

            case R.id.bplu:

                break;

            case R.id.bsub:

                break;

            case R.id.bdiv:

                break;

            case R.id.bdot:

                break;

            case R.id.br:

                break;

            case R.id.bc:

                break;


        }

    }
}
