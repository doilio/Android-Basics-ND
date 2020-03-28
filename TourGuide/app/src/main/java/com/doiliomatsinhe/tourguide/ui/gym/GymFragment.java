package com.doiliomatsinhe.tourguide.ui.gym;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.doiliomatsinhe.tourguide.R;
import com.doiliomatsinhe.tourguide.adapter.ContentAdapter;
import com.doiliomatsinhe.tourguide.databinding.ContentListBinding;
import com.doiliomatsinhe.tourguide.model.Content;
import com.doiliomatsinhe.tourguide.ui.detail.DetailActivity;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class GymFragment extends Fragment {

    private static final String CONTENT_EXTRA = "Extra_content";
    private ContentListBinding binding;

    public GymFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.content_list, container, false);

        // Creates a list of content
        final ArrayList<Content> contentList = populateContentList();

        // Seting the Adapter
        ContentAdapter adapter = new ContentAdapter(Objects.requireNonNull(getActivity()), contentList);
        binding.list.setAdapter(adapter);

        // Seting ClickListeners on the List Items
        contentListClickListener(contentList);


        return binding.getRoot();
    }

    private void contentListClickListener(final ArrayList<Content> contentList) {
        binding.list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Content content = contentList.get(position);

                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra(CONTENT_EXTRA, content);
                startActivity(i);
            }
        });
    }

    private ArrayList<Content> populateContentList() {
        final ArrayList<Content> contentList = new ArrayList<>();


        // Populating my list of content
        contentList.add(new Content(getString(R.string.universo),getString(R.string.universo_location),getString(R.string.universo_time),R.drawable.universo,getString(R.string.universo_site),getString(R.string.universo_description),getString(R.string.universo_numero)));
        return contentList;
    }
}
