package com.example.furniture_favorite_model_pass.ui.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniture_favorite_model_pass.databinding.DItemCardBinding;
import com.example.furniture_favorite_model_pass.models.Model;
import com.example.furniture_favorite_model_pass.ui.home.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.ViewHolder> {
    DItemCardBinding binding;
    List<Model> listD = new ArrayList<>();

    public void setListD(List<Model> listD) {
        this.listD = listD;
    }

    @NonNull
    @Override
    public DashboardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DItemCardBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardAdapter.ViewHolder holder, int position) {
        holder.onBind(listD.get(position));

    }

    @Override
    public int getItemCount() {
        return listD.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull DItemCardBinding itemView) {
            super(itemView.getRoot());
        }

        public void onBind(Model model) {
            binding.nameCard.setText(model.getName_product());
            binding.priceCard.setText(String.valueOf(model.getPrice_product()));
            binding.descriptionCard.setText(model.getDescription_product());
            binding.imageCard.setImageResource(model.getImage_product());

        }
    }
}
