package com.example.user.sastodeal;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterSection extends RecyclerView.Adapter<CustomAdapterSection.CustomViewHolder> {
    ArrayList<Products> entityArrayListSection;


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_newarrival, parent, false);
        CustomViewHolder vh = new CustomViewHolder(v);
        return vh;

    }
    public CustomAdapterSection(ArrayList<Products> entityArrayList) {
        this.entityArrayListSection = entityArrayList;

    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Products recruitItem=entityArrayListSection.get(position);

       holder.tv_newstitle.setText(recruitItem.getNews_title());
        holder.tv_date.setText(recruitItem.getDate());
       holder.img.setImageResource((recruitItem.getImage()));
    }

    @Override
    public int getItemCount() {
        return entityArrayListSection.size();

    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder{
        public CardView cardView;
        public TextView tv_newstitle,tv_date;
        public ImageView img;
        public CustomViewHolder(final View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.card);
            tv_newstitle=(TextView)itemView.findViewById(R.id.title);
            tv_date=(TextView)itemView.findViewById(R.id.rec_content);
            img=(ImageView)itemView.findViewById(R.id.image);

        }


    }


}
