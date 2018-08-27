package com.reddit.online.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.reddit.online.Callbacks.onAnswerClickListener;
import com.reddit.online.Model.Children;
import com.reddit.online.R;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.QuestionsViewHolder> {

    private Context context;
    onAnswerClickListener onCallback;
    private ArrayList<Children> childList = new ArrayList<>();

    public PostsAdapter(Context context) {
        this.context = context;
        onCallback = (onAnswerClickListener) context;
    }

    @NonNull
    @Override
    public QuestionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.post_child_layout, null);
        QuestionsViewHolder viewHolder = new QuestionsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionsViewHolder holder, int position) {
        holder.onBind(childList, position);
    }

    @Override
    public int getItemCount() {
        return childList.size();
    }

    public void setData(ArrayList<Children> list) {
        this.childList = list;
    }

    public class QuestionsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvPostTitle;
        private TextView tvPostSelfText;
        private ImageView ivPostImage;
        private TextView tvLikes;
        private TextView tvComments;
        private TextView tvShare;

        public QuestionsViewHolder(View itemView) {
            super(itemView);
            tvPostTitle = itemView.findViewById(R.id.post_title);
            ivPostImage = itemView.findViewById(R.id.post_image);
            tvPostSelfText = itemView.findViewById(R.id.post_selfText);
            tvLikes = itemView.findViewById(R.id.post_like);
            tvComments = itemView.findViewById(R.id.post_comments);
            tvShare = itemView.findViewById(R.id.post_share);
        }


        @Override
        public void onClick(View v) {
            onCallback.onClick(v, getAdapterPosition());
        }

        public void onBind(ArrayList<Children> childList, int position) {
            tvPostTitle.setText(childList.get(position).getData().getTitle());
            try {
                if (childList.get(position).getData().getSelftext().isEmpty()) {
                    Glide.with(context).load(childList.get(position).getData().getPreview()
                            .getImages().get(0).getSource().getUrl()).into(ivPostImage);
                } else {
                    tvPostSelfText.setText(childList.get(position).getData().getSelftext());
                    tvPostSelfText.setVisibility(View.GONE);
                }
                tvLikes.setText(countFormat(childList.get(position).getData().getUps())+" Likes");
                tvComments.setText(countFormat(childList.get(position).getData().getNum_comments())+ " Comments");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }


    private String countFormat(int number) {

        String numberString = "";
        if (Math.abs(number / 1000000) > 1) {
            numberString = (number / 1000000) + "M";
        } else if (Math.abs(number / 1000) >= 1) {
            numberString = (number / 1000) + "K";
        } else {
            numberString = String.valueOf(number);
        }
        return numberString;
    }
}
