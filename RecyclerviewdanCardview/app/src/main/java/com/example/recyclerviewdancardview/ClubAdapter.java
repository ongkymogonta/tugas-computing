package com.example.recyclerviewdancardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ViewHolder> {


    private ArrayList<ClubModel> clubModels;

    public ClubAdapter(ArrayList<ClubModel> clubModels) {
        this.clubModels = clubModels;
    }

    @NonNull
    @Override
    public ClubAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubAdapter.ViewHolder holder, int position) {
        holder.namClub.setText(clubModels.get(position).getNamaClub());
        holder.logoClub.setImageResource(clubModels.get(position).getLogoClub());
    }

    @Override
    public int getItemCount() {
        return clubModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namClub;
        ImageView logoClub;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namClub = itemView.findViewById(R.id.nama_club);
            logoClub = itemView.findViewById(R.id.logo_club);
        }
    }
}