package com.doiliomatsinhe.newsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    private List<News> newsList = new ArrayList<>();
    private OnNewsListener listener;

    public NewsAdapter(OnNewsListener listener) {
        this.listener = listener;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView title, section, date, author;
        private OnNewsListener listener;

        private MyViewHolder(@NonNull View itemView, OnNewsListener listener) {
            super(itemView);
            title = itemView.findViewById(R.id.news_title);
            section = itemView.findViewById(R.id.news_section);
            date = itemView.findViewById(R.id.news_date);
            author = itemView.findViewById(R.id.news_author);
            this.listener = listener;
            itemView.setOnClickListener(this);
        }

        void bind(News news) {
            title.setText(news.getTitle());
            section.setText(news.getSection());
            date.setText(news.getDate());
            if (news.getAuthor().isEmpty()) {
                author.setVisibility(View.GONE);
            } else {
                author.setText(news.getAuthor());
            }

        }

        @Override
        public void onClick(View v) {
            listener.onNewsClick(getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.news_item, parent, false);
        return new MyViewHolder(view, listener);
    }

    public void set(List<News> newsList) {
        this.newsList = newsList;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        News currentNews = newsList.get(position);
        holder.bind(currentNews);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public interface OnNewsListener {
        void onNewsClick(int position);
    }

}
