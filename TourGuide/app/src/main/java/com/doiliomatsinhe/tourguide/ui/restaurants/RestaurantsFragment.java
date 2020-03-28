package com.doiliomatsinhe.tourguide.ui.restaurants;

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
public class RestaurantsFragment extends Fragment {

    private static final String CONTENT_EXTRA = "Extra_content";
    private ContentListBinding binding;

    public RestaurantsFragment() {
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
        contentList.add(new Content(getString(R.string.el_patron), getString(R.string.el_patron_address), getString(R.string.el_patron_hours), R.drawable.el_patron, getString(R.string.el_patron_site), getString(R.string.el_patron_description), getString(R.string.el_patron_phone)));
        contentList.add(new Content(getString(R.string.ficka), getString(R.string.ficka_address), getString(R.string.ficka_hours), R.drawable.ficka, getString(R.string.ficka_site), getString(R.string.ficka_description), getString(R.string.ficka_telephone)));
        contentList.add(new Content(getString(R.string.backyard), getString(R.string.backyard_address), getString(R.string.backyard_hours), R.drawable.backyard, getString(R.string.backyard_site), getString(R.string.backyard_description), getString(R.string.backyard_phone)));
        contentList.add(new Content(getString(R.string.moztacho), getString(R.string.moztacho_address), getString(R.string.moztacho_hours), R.drawable.moztacho, getString(R.string.moztacho_site), getString(R.string.moztacho_description), getString(R.string.moztacho_phone)));
        contentList.add(new Content(getString(R.string.southbeach), getString(R.string.southbeach_address), getString(R.string.southbeach_hours), R.drawable.southbeach, getString(R.string.southbeach_site), getString(R.string.southbeach_description), getString(R.string.southbeach_phone)));
        contentList.add(new Content(getString(R.string.kardapio), getString(R.string.kardapio_address), getString(R.string.kardapio_hours), R.drawable.kardapiokaseiro, getString(R.string.kardapio_site), getString(R.string.kardapio_description), getString(R.string.kardapio_phone)));
        contentList.add(new Content(getString(R.string.farol), getString(R.string.farol_address), getString(R.string.farol_hours), R.drawable.ofarol, getString(R.string.farol_site), getString(R.string.farol_description), getString(R.string.farol_phone)));
        contentList.add(new Content(getString(R.string.bar_1908), getString(R.string.bar_1908_address), getString(R.string.bar_1908_hours), R.drawable.mil, getString(R.string.bar_1908_site), getString(R.string.bar_1908_description), getString(R.string.bar_1908_phone)));

        return contentList;
    }
}
