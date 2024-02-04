package com.example.furniture_favorite_model_pass.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.furniture_favorite_model_pass.R;
import com.example.furniture_favorite_model_pass.databinding.FragmentHomeBinding;
import com.example.furniture_favorite_model_pass.models.Model;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    List<Model> list = new ArrayList<>();
    HomeAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        adapter = new HomeAdapter();
        createList();
        adapter.setList(list);
        binding.rvMainCatalog.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list.add(new Model("Кровать Red Flame", 690,
                "Диван двухстворчатый раскладной производство Турция," +
                        " матрас набивной пружинный, кокосовая стружка", R.drawable.bad_red_flame));


        list.add(new Model("Диван Prime", 490,
                "Диван двухстворчатый раскладной производство Германия," +
                        " матрас набивной пружинный, кокосовая стружка", R.drawable.sofa_blu_charm));

        list.add(new Model("Мягкая мебель Trio Martin", 1890,
                " производство Италия," + " Riotello"
                , R.drawable.sofa_set_trio_martin));

        list.add(new Model("Мягкая мебель Трио Супер Стиль", 2820,
                " производство Италия," + " Mario Fabric " + "отделка: атлас и гобелен," +
                        "набивной, специальный состав"
                , R.drawable.sofa_yellow));

        list.add(new Model("Банкетка Флок Стиль", 360,
                " производство Италия," + " Riotello " + "отделка: атлас и гобелен," +
                        "набивной, специальный состав"
                , R.drawable.bancetca_getsby));

        list.add(new Model("Кресло Грин Палас", 830,
                " производство Италия," + " Mario Fabric " + "отделка: бархат и гобелен," +
                        "набивной, специальный состав"
                , R.drawable.chair_green_palasjpg));

        list.add(new Model("Кресло Blu_soul", 790,
                " производство Италия," + " Riotello " + "отделка: атлас и гобелен," +
                        "набивной, специальный состав"
                , R.drawable.chair_rose_bump));
        list.add(new Model("Кровать Red_sunrise", 1100,
                " производство Италия," + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," +
                        "набивной, специальный состав"
                , R.drawable.bed_parlament));
        list.add(new Model("Кровать Plot", 1340,
                " производство Италия," + " Riotello " + "отделка: хлопок и гобелен," +
                        "набивной, специальный состав"
                , R.drawable.bed_super_stable));
        list.add(new Model("Кровать Parlament", 1200,
                " производство Италия," + "Mario Fabric " + "отделка: хлопок и атлас," +
                        "набивной, специальный состав"
                , R.drawable.bad_red_flame));
        list.add(new Model("диван Blu Charm ", 1200,
                " производство Италия," + " Riotello  " + "отделка: бархат и гобелен," +
                        "набивной, специальный состав"
                , R.drawable.sofa_blu_charm));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}