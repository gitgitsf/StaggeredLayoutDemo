package com.meewah.staggeredlayoutdemo.adapters;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.meewah.staggeredlayoutdemo.R;
import com.meewah.staggeredlayoutdemo.models.ImageModel;

import java.util.ArrayList;

public class MyCustomAdapter extends  RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {

    private Context mContext;

    private ArrayList<ImageModel> mImageList;
    public MyViewHolder myViewHolder;

    public MyCustomAdapter(Context context, ArrayList<ImageModel> imageList) {

        mContext = context;
        mImageList = imageList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(mContext).inflate(R.layout.list_item_row, parent, false);

        myViewHolder = new MyViewHolder(cardView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvName.setText(mImageList.get(position).getName());
        holder.ivImage.setImageResource(mImageList.get(position).getImageDrawerId());
    }

    @Override
    public int getItemCount() {
        return mImageList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivImage;
        TextView tvName;

        public MyViewHolder(CardView cardView) {
            super(cardView);
            tvName = (TextView) cardView.findViewById(R.id.tvName);
            ivImage = (ImageView) cardView.findViewById(R.id.ivImage);

        }
    }

}

