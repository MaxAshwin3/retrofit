package com.example.retrofitexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
   List<Post> postList;
   Context context;

    public PostAdapter(List<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
       return new PostViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        Post post = postList.get(position);
        holder.userId.setText(post.getUser_id());
        holder.id.setText(post.getId());
        holder.body.setText(post.getBody());
        holder.title.setText(post.getTitle());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
    public class PostViewHolder extends RecyclerView.ViewHolder{
          TextView userId , id , title , body ;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            userId = itemView.findViewById(R.id.textView2);
            id = itemView.findViewById(R.id.textView3);
            title = itemView.findViewById(R.id.textView4);
            body = itemView.findViewById(R.id.textView5);
        }

    }
}
