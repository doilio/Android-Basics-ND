package com.doiliomatsinhe.musicalstructure.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.doiliomatsinhe.musicalstructure.R;
import com.doiliomatsinhe.musicalstructure.model.Track;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(@NonNull Context context, ArrayList<Track> trackList) {
        super(context, 0, trackList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View trackListView = convertView;
        if (trackListView == null) {
            trackListView = LayoutInflater.from(getContext()).inflate(R.layout.track_item, parent, false);
        }

        // contains the current track
        Track currentTrack = getItem(position);

        // Finds the Views by ID
        TextView trackArtist = trackListView.findViewById(R.id.track_artist);
        TextView trackName = trackListView.findViewById(R.id.track_name);
        ImageView trackImage = trackListView.findViewById(R.id.track_image);

            // Populates the specified fields
        if (currentTrack != null) {
            Picasso.get().load(currentTrack.getTrackCover()).into(trackImage);
            trackArtist.setText(currentTrack.getTrackArtist());
            trackName.setText(currentTrack.getTrackName());
        }


        return trackListView;
    }
}
