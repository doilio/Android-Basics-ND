package com.doiliomatsinhe.tourguide.ui.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.doiliomatsinhe.tourguide.R;
import com.doiliomatsinhe.tourguide.databinding.ActivityDetailBinding;
import com.doiliomatsinhe.tourguide.model.Content;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private static final String CONTENT_EXTRA = "Extra_content";
    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        initLayout();

    }

    /**
     * Initializes the Detail Layout by inflating all the necessary views with
     * data received from the MainActivity.
     */
    private void initLayout() {

        Intent i = getIntent();
        Content content = (Content) i.getSerializableExtra(CONTENT_EXTRA);

        assert content != null;
        if (content.getWebsite() == null && content.getTelephone() == null) {
            binding.telephoneIcon.setVisibility(View.GONE);
            binding.websiteIcon.setVisibility(View.GONE);
            binding.contentWebsite.setVisibility(View.GONE);
            binding.contentTelephone.setVisibility(View.GONE);
        }
        binding.contentName.setText(content.getName());
        binding.contentLocation.setText(content.getAddress());
        binding.contentHours.setText(content.getHours());
        binding.contentTelephone.setText(content.getTelephone());
        binding.contentDescription.setText(content.getDescription());
        binding.contentWebsite.setText(content.getWebsite());

        Picasso.get().load(content.getCover()).into(binding.contentCover);

    }

    /**
     * Replaces the default navigateUp action.
     * So that it may go back to the last tab where I was and not the 1st one.
     */
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }
}
