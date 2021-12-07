package com.example.beanbag.Adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.beanbag.Domain.BeanBagDomain;
import com.example.beanbag.R;

import java.time.Instant;
import java.util.ArrayList;

public class CatagoryAdpter extends RecyclerView.Adapter<CatagoryAdpter.viewHolder> {
    ArrayList<BeanBagDomain> beanBagDomains;


    public CatagoryAdpter(ArrayList<BeanBagDomain> beanBagDomains) {
        this.beanBagDomains = beanBagDomains;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_cart,parent,false);
        return new viewHolder(inflate);
    }



    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.catagoryName.setText(beanBagDomains.get(position).getTitle());
        String picUrl="";
        switch (position){
            case 0:{
                picUrl="imag1";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.catagory_bg1));
                break;
            }
            case 1: {
                picUrl = "imag2";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.catagory_bg1));
                break;
            }
            case 2: {
                picUrl = "imag3";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.catagory_bg1));
                break;
            }
            case 4: {
                picUrl = "imag4";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.catagory_bg1));
                break;
            }
            case 5: {
                picUrl = "imag5";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.catagory_bg1));
                break;
            }

        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
            Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.CatagoryPic);

    }


    @Override
    public int getItemCount() {
        return beanBagDomains.size();
    }
    public class viewHolder extends RecyclerView.ViewHolder{
        TextView catagoryName;
        ImageView CatagoryPic;
        ConstraintLayout mainLayout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            catagoryName=itemView.findViewById(R.id.catagoryName);
           mainLayout=itemView.findViewById(R.id.mainLayout);
            CatagoryPic=itemView.findViewById(R.id.CatagoryPic);

        }
    }
}
