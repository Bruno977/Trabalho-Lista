package com.example.feedmeutalento;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[];
    int imagesProfile [];
    int imagesFeed [];
    Context context;

    public MyAdapter (Context ct, String s1[], int imgProfile[], int imgFeed[]){
        context = ct;
        data1 =  s1;
        imagesProfile = imgProfile;
        imagesFeed = imgFeed;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_feedlist, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.username.setText(data1[position]);
        holder.feedPhoto.setImageResource(imagesFeed[position]);
        holder.profilePhoto.setImageResource(imagesProfile[position]);
    }

    @Override
    public int getItemCount() {
        return imagesProfile.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView username;
        CircleImageView profilePhoto;
        SquareImageView feedPhoto;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.username);
            profilePhoto = itemView.findViewById(R.id.profile_photo);
            feedPhoto = itemView.findViewById(R.id.post_image);
        }
    }
}
