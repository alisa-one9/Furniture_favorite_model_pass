package com.example.furniture_favorite_model_pass.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.furniture_favorite_model_pass.databinding.FragmentDashboardBinding;
import com.example.furniture_favorite_model_pass.models.Model;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {
    private FragmentDashboardBinding binding;
    private ArrayList<Model> d_list = new ArrayList<>();
    DashboardAdapter adapter;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new DashboardAdapter();

        if (getArguments() != null) {
            d_list = getArguments().getParcelableArrayList("favorite");

        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (d_list!= null) {

            adapter.setListD(d_list);

        } else  {
            Toast.makeText(requireActivity(), "Вы не выбрали товар", Toast.LENGTH_SHORT).show();
        }

        binding.rvDetailsCatalog.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}