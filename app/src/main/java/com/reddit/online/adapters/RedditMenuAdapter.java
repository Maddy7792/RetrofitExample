package com.reddit.online.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.reddit.online.Callbacks.onAnswerClickListener;
import com.reddit.online.Model.Children;
import com.reddit.online.R;

import java.util.ArrayList;

public class RedditMenuAdapter extends RecyclerView.Adapter<RedditMenuAdapter.MenuViewHolder> {

    private Context context;
    onAnswerClickListener onCallback;
    private int[] logoList;
    private ArrayList<String> redditList;

    public RedditMenuAdapter(Context context) {
        this.context = context;
        onCallback = (onAnswerClickListener) context;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_child_layout, null);
        MenuViewHolder viewHolder = new MenuViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        holder.onBind(redditList, position);
    }

    @Override
    public int getItemCount() {
        return redditList.size();
    }



    public void setData(int[] imagesList, ArrayList<String> redditTextlist) {
        this.redditList = redditTextlist;
        this.logoList = imagesList;
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvPostTitle;
        private ImageView ivPostImage;
        private CardView cardView;


        public MenuViewHolder(View itemView) {
            super(itemView);
            tvPostTitle = itemView.findViewById(R.id.list_Text);
            ivPostImage = itemView.findViewById(R.id.list_image);
            cardView = itemView.findViewById(R.id.list_card);
            cardView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            onCallback.onClick(v, getAdapterPosition());
        }

        public void onBind(ArrayList<String> childList, int position) {
            tvPostTitle.setText(childList.get(position));
            ivPostImage.setImageResource(logoList[position]);

        }
    }



}
