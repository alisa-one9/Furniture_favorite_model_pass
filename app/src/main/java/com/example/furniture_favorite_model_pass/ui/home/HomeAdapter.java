package com.example.furniture_favorite_model_pass.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.furniture_favorite_model_pass.R;
import com.example.furniture_favorite_model_pass.databinding.ItemCardBinding;
import com.example.furniture_favorite_model_pass.models.Model;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    ItemCardBinding binding;
    List<Model> list = new ArrayList<>();
    NavController navController;
    private ArrayList<Model> selected_list = new ArrayList<>();
    Model modelPass;

    public void setList(List<Model> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCardBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(v1->{


            });

        }

        public void onBind(Model model) {
            binding.sdDone.setOnClickListener(view -> {
                selected_list.add(model);
                navController = Navigation.findNavController((Activity)itemView.getContext(),
                        R.id.nav_host_fragment_activity_main);
                Bundle bundle = new Bundle();

                bundle.putParcelableArrayList("favorite", selected_list);

                navController.navigate(R.id.navigation_dashboard, bundle);
            });

            binding.nameCard.setText(model.getName_product());
            binding.priceCard.setText(String.valueOf(model.getPrice_product()));
            binding.descriptionCard.setText(model.getDescription_product());
            binding.imageCard.setImageResource(model.getImage_product());

//             Glide.with(itemView.getContext())
//                    .load(model.getImage_product())
//                      .centerCrop()
//                      .into(binding.imageCard);
        }
    }
}
