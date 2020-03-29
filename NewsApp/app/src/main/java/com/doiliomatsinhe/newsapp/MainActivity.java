package com.doiliomatsinhe.newsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.doiliomatsinhe.newsapp.databinding.ActivityMainBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String>, SwipeRefreshLayout.OnRefreshListener, NewsAdapter.OnNewsListener {

    private ActivityMainBinding binding;
    private NewsAdapter adapter;
    ArrayList<News> newsList = new ArrayList<>();

    //Constants
    private static final String TAG = "MainActivity";
    private static final int LOADER_ID = 0;
    private static final String QUERY = "query";
    private static final String RESPONSE = "response";
    private static final String RESULTS = "results";
    private static final String WEB_TITLE = "webTitle";
    private static final String SECTION_NAME = "sectionName";
    private static final String WEB_PUBLICATION_DATE = "webPublicationDate";
    private static final String WEB_URL = "webUrl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initialConfig();

        setupRecyclerView();

        retrieveData();

    }

    /**
     * Prepares the Loader.
     */
    private void initialConfig() {
        binding.swipeRefreshNews.setOnRefreshListener(this);

        if (LoaderManager.getInstance(this).getLoader(LOADER_ID) != null) {
            LoaderManager.getInstance(this).initLoader(LOADER_ID, null, this);
        }

    }

    /**
     * Prepares the RecyclerView and sets it up with the adapter
     */
    private void setupRecyclerView() {
        adapter = new NewsAdapter(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerNews.setLayoutManager(layoutManager);
        binding.recyclerNews.setHasFixedSize(true);
        binding.recyclerNews.setAdapter(adapter);
    }

    /**
     * Method that is triggered whenever the layout is pulled down
     */
    @Override
    public void onRefresh() {
        retrieveData();
    }

    /**
     * Retrieves the data to be populated on the RecyclerView
     */
    private void retrieveData() {
        binding.swipeRefreshNews.setRefreshing(true);
        String queryString = "sport";

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {

            Bundle queryBundle = new Bundle();
            queryBundle.putString(QUERY, queryString);
            LoaderManager.getInstance(this).restartLoader(LOADER_ID, queryBundle, this);

        } else {
            if (queryString.length() != 0) {
                // Check your Network
                Toast.makeText(this, R.string.check_internet, Toast.LENGTH_SHORT).show();
                binding.swipeRefreshNews.setRefreshing(false);
            }
        }
    }

    /**
     * Method that created the Loader being used in this activity.
     */
    @NonNull
    @Override
    public Loader<String> onCreateLoader(int id, @Nullable Bundle args) {
        String queryString = "";

        if (args != null) {
            queryString = args.getString(QUERY);
        }
        return new NewsLoader(this, queryString);
    }

    /**
     * When the loader finished, this method returns the result on the Main Thread.
     */
    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String data) {

        newsList = new ArrayList<>();
        // Fazer Parse do JSON
        try {
            JSONObject jsonObject = new JSONObject(data);
            JSONObject response = jsonObject.getJSONObject(RESPONSE);
            JSONArray results = response.getJSONArray(RESULTS);

            //Loop array of results
            for (int i = 0; i < results.length(); i++) {
                JSONObject news = results.getJSONObject(i);

                // My Values
                String webTitle = news.getString(WEB_TITLE);
                String sectionName = news.getString(SECTION_NAME);
                String webPublicationDate = news.getString(WEB_PUBLICATION_DATE);
                String webUrl = news.getString(WEB_URL);

                //Add to ArrayList
                newsList.add(new News(webTitle, sectionName, webPublicationDate, webUrl));
            }
            adapter.set(newsList);
            if (newsList.isEmpty()) {
                showEmptyLayout();
            } else {
                showNews();
            }


            binding.swipeRefreshNews.setRefreshing(false);

        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "onLoadFinished: " + e.getMessage());
        }
    }

    private void showEmptyLayout() {
        binding.recyclerNews.setVisibility(View.GONE);
        binding.exceptions.setVisibility(View.VISIBLE);
    }

    private void showNews() {
        binding.exceptions.setVisibility(View.GONE);
        binding.recyclerNews.setVisibility(View.VISIBLE);
    }

    @Override
    public void onLoaderReset(@NonNull Loader<String> loader) {
    }

    @Override
    public void onNewsClick(int position) {
        News currentNews = newsList.get(position);
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(currentNews.getUrl()));
        startActivity(i);
    }
}
