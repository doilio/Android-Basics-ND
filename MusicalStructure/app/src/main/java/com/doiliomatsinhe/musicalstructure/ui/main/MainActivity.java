package com.doiliomatsinhe.musicalstructure.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.doiliomatsinhe.musicalstructure.R;
import com.doiliomatsinhe.musicalstructure.adapter.TrackAdapter;
import com.doiliomatsinhe.musicalstructure.databinding.ActivityMainBinding;
import com.doiliomatsinhe.musicalstructure.model.Track;
import com.doiliomatsinhe.musicalstructure.ui.detail.DetailActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String TRACK_EXTRA = "Track";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Creates a list of Tracks
        final ArrayList<Track> trackList = populateTrackList();

        // Seting the Adapter
        TrackAdapter adapter = new TrackAdapter(this, trackList);
        binding.trackList.setAdapter(adapter);

        // Seting ClickListeners on the List Items
        trackListClickListener(trackList);
    }

    /**
     * Sets ClickListeners on the Tracklist to open a detailActivity with the corresponding data.
     * @param trackList is a list of tracks.
     */
    private void trackListClickListener(final ArrayList<Track> trackList) {
        binding.trackList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Track track = trackList.get(position);
                Intent i = new Intent(getApplicationContext(), DetailActivity.class);
                i.putExtra(TRACK_EXTRA, track);
                startActivity(i);
            }
        });
    }

    /**
     * Creates a list of tracks and populates it accordingly.
     * @return list of tracks.
     */
    private ArrayList<Track> populateTrackList() {

        final ArrayList<Track> trackList = new ArrayList<>();

        // Populating my list of Tracks
        trackList.add(new Track(R.drawable.young_sistas, getString(R.string.young_sistas), getString(R.string.djimetta)));
        trackList.add(new Track(R.drawable.bander, getString(R.string.sai_pra_estrada), getString(R.string.bander)));
        trackList.add(new Track(R.drawable.mapira_beats, getString(R.string.ta_se_a_matar), getString(R.string.radek)));
        trackList.add(new Track(R.drawable.fly_away, getString(R.string.fly_away), getString(R.string.obs)));
        trackList.add(new Track(R.drawable.young_ricardo, getString(R.string.tas_a_ver), getString(R.string.young_ricardo)));
        trackList.add(new Track(R.drawable.cr_boy, getString(R.string.copo_vermelho), getString(R.string.cr_boy)));
        trackList.add(new Track(R.drawable.cubaliwa, getString(R.string.mentiras_da_verdade), getString(R.string.azagaia)));
        trackList.add(new Track(R.drawable.dice, getString(R.string.chines), getString(R.string.dice_chines)));
        trackList.add(new Track(R.drawable.ellputo, getString(R.string.nao_ouve_dizer), getString(R.string.ell_puto)));
        trackList.add(new Track(R.drawable.kevin, getString(R.string.go_do_that), getString(R.string.wazimbex)));
        trackList.add(new Track(R.drawable.lizha, getString(R.string.vais_rochar), getString(R.string.lizha_james_vais_rochar)));
        return trackList;
    }
}
