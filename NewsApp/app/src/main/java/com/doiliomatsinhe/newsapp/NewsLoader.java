package com.doiliomatsinhe.newsapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

class NewsLoader extends AsyncTaskLoader<String> {
    private String queryString;

    public NewsLoader(Context context, String queryString) {
        super(context);
        this.queryString = queryString;
    }

    /**
     * Gets the Network Result Asynchronously
     * @return the Json String.
     */
    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getNews(queryString);
    }

    /**
     * Called when the loader is started to force loading on the background thread.
     */
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        // Start Loading in the background
        forceLoad();
    }
}
