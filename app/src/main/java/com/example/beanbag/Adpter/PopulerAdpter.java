package com.example.beanbag.Adpter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.beanbag.Domain.BeanDomain;
import com.example.beanbag.R;
import com.example.beanbag.ShowDetailActvity;

import java.util.ArrayList;

public class PopulerAdpter extends RecyclerView.Adapter<PopulerAdpter.viewHolder> {
    ArrayList<BeanDomain> beanDomains;


    public PopulerAdpter(ArrayList<BeanDomain> beanDomains) {
        this.beanDomains = beanDomains;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_poopuler,parent,false);
        return new viewHolder(inflate);
    }



    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.title.setText(beanDomains.get(position).getTitle());
        holder.fee.setText(String.valueOf(beanDomains.get(position).getFee()));

        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(beanDomains.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());
            Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);
            holder.addBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(holder.itemView.getContext(),ShowDetailActvity.class);
                    intent.putExtra("object",beanDomains.get(position));
                    holder.itemView.getContext().startActivity(intent);
                }
            });

    }


    @Override
    public int getItemCount() {
        return beanDomains.size();
    }
    public class viewHolder extends RecyclerView.ViewHolder{
        TextView title,fee;
        ImageView pic;
        TextView addBtn;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            fee=itemView.findViewById(R.id.fee);
            pic=itemView.findViewById(R.id.pic);
            addBtn=itemView.findViewById(R.id.addBtn);

        }
    }
}
