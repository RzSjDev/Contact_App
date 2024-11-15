package com.example.gridview_example.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gridview_example.R;


import java.util.List;

public class TableAdapter extends RecyclerView.Adapter<TableAdapter.ViewHolder> {

    Context context;
    List<TableModel> tableModels;

    public TableAdapter(Context context, List<TableModel> tableModels) {
        this.context = context;
        this.tableModels = tableModels;
    }
    public void SetFilter(List<TableModel> filterText){
        this.tableModels=filterText;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.items_table,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TableAdapter.ViewHolder holder, int position) {
             if(tableModels!=null&& !tableModels.isEmpty()){
                TableModel model=tableModels.get(position);
                holder.Row.setText(model.getRow());
                holder.FullName.setText(model.getFullName());
                holder.NationalCode.setText(model.getNationalCode());
                holder.ImageView.setImageResource(model.getImageView());
                holder.tableRow.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.anim_row));
             }
    }

    @Override
    public int getItemCount() {
        return tableModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView Row,FullName,NationalCode;
        TableRow tableRow ;
        ImageView ImageView;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            Row=itemView.findViewById(R.id.Row);
            FullName=itemView.findViewById(R.id.FullName);
            NationalCode=itemView.findViewById(R.id.NationalCode);
            ImageView=itemView.findViewById(R.id.ImageView);
            tableRow=itemView.findViewById(R.id.TableRow);
        }
    }
}
