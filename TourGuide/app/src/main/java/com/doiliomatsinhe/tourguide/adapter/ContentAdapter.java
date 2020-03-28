package com.doiliomatsinhe.tourguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.doiliomatsinhe.tourguide.R;
import com.doiliomatsinhe.tourguide.model.Content;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ContentAdapter extends ArrayAdapter<Content> {

    public ContentAdapter(@NonNull Context context, ArrayList<Content> contentList) {
        super(context, 0, contentList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.content_item, parent, false);
        }
        // contains the current content
        Content currentContent = getItem(position);

        // Finds the Views by ID
        TextView contentName = convertView.findViewById(R.id.content_name);
        TextView contentDescription = convertView.findViewById(R.id.content_description);
        ImageView contentImage = convertView.findViewById(R.id.content_image);

        // Populates the specified fields
        if (currentContent != null) {
            Picasso.get().load(currentContent.getCover()).into(contentImage);
            contentName.setText(currentContent.getName());
            contentDescription.setText(currentContent.getDescription());
        }

        return convertView;
    }
}
