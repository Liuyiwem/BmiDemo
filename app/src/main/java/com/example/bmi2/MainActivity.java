package com.example.bmi2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bmi2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        binding.button.setOnClickListener(buttonOnClick);


        binding.help.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Help")
                        .setMessage("Body mass index (BMI) is a value derived from the mass (weight) and height of a person.")
                        .setPositiveButton("OK",null)
                        .show();

            }
        });
    }




//    View.OnClickListener buttonOnClick = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            float weight = Float.parseFloat(binding.weight.getText().toString());
//            float height = Float.parseFloat(binding.height.getText().toString());
//            float bmi = weight / (height*height);
//            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
//            intent.putExtra("BMI", bmi);
//            startActivity(intent);
//
//
//        }
//    };



    public void bmi(View view){
        float weight = Float.parseFloat(binding.weight.getText().toString());
        float height = Float.parseFloat(binding.height.getText().toString());
        float bmi = weight / (height*height);
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BMI", bmi);
        startActivity(intent);


    }
}