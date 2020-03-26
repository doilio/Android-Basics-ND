package com.doiliomatsinhe.quizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.doiliomatsinhe.quizapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateFields();
            }
        });
    }

    private void validateFields() {
        score = 0;
        // Verifying the First Question
        if (binding.inputAnswer1.getText() != null) {
            if (binding.inputAnswer1.getText().toString().toLowerCase().contains("kotlin")) {
                score += 1;
            }
        }

        //Verifying the Second Question
        if (binding.buildButton2.isChecked()) {
            score += 1;
        }

        //Verifying the Third Question
        if (binding.layoutButton3.isChecked()) {
            score += 1;
        }

        //Verifying the Fourth Question
        if (binding.groupCheck1.isChecked() && binding.groupCheck3.isChecked() && !binding.groupCheck2.isChecked() && !binding.groupCheck4.isChecked()) {
            score += 1;
        }


        Toast.makeText(this, score + "/4", Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.ic_clear) {
            clearFields();
        }

        return super.onOptionsItemSelected(item);
    }

    private void clearFields() {
        // Reset the score back to 0
        score = 0;
        // First
        if (binding.inputAnswer1.getText() != null) {
            binding.inputAnswer1.getText().clear();
        }

        // Second
        binding.buildRadioGroup.clearCheck();

        // Third
        binding.layoutRadioGroup.clearCheck();

        // Fourth
        binding.groupCheck1.setChecked(false);
        binding.groupCheck2.setChecked(false);
        binding.groupCheck3.setChecked(false);
        binding.groupCheck4.setChecked(false);

    }
}
