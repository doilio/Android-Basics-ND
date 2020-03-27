package com.doiliomatsinhe.musicalstructure.ui.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.doiliomatsinhe.musicalstructure.R;
import com.doiliomatsinhe.musicalstructure.databinding.ActivityDetailBinding;
import com.doiliomatsinhe.musicalstructure.model.Track;
import com.squareup.picasso.Picasso;

import static com.doiliomatsinhe.musicalstructure.ui.main.MainActivity.TRACK_EXTRA;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        initLayout();

        setClickListeners();

    }

    /**
     * Initializes the Detail Layout by inflating all the necessary views with
     * data received from the MainActivity.
     */
    private void initLayout() {

        Intent i = getIntent();
        Track track = (Track) i.getSerializableExtra(TRACK_EXTRA);

        if (track != null) {
            binding.trackArtist.setText(track.getTrackArtist());
            binding.trackName.setText(track.getTrackName());
            Picasso.get().load(track.getTrackCover())
                    .into(binding.trackImage);
        }
    }

    /**
     * Sets click listeners on the PLAY, REWIND, SKIP buttons
     */
    private void setClickListeners() {
        binding.playTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
            }
        });

        binding.rewindTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Rewind", Toast.LENGTH_SHORT).show();
            }
        });

        binding.skipTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Skip", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
