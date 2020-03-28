package com.doiliomatsinhe.tourguide.ui.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import com.doiliomatsinhe.tourguide.R;
import com.doiliomatsinhe.tourguide.adapter.SectionsPagerAdapter;
import com.doiliomatsinhe.tourguide.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupViewPager();

        setupClickListener();
    }

    private void setupClickListener() {
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();
            }
        });
    }

    private void setupViewPager() {
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        binding.viewPager.setAdapter(sectionsPagerAdapter);
        binding.tabs.setupWithViewPager(binding.viewPager);
    }

    /**
     * Intent to work with the fab, so that I may receive suggestions
     */
    private void sendEmail() {
        String to = "doiliomatsinhe@gmail.com";
        String subject = "Request new Location";
        String body = "Hi, my name is __________ , \n\nI would like to suggest the addition of __________ in the _________ Tab. \n\n\n\nBest Regards";
        String mailTo = "mailto:" + to +
                "?&subject=" + Uri.encode(subject) +
                "&body=" + Uri.encode(body);
        Intent emailIntent = new Intent(Intent.ACTION_VIEW);
        emailIntent.setData(Uri.parse(mailTo));

        if (getPackageManager() != null && emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
    }
}