package com.example.bootcampodev6.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcampodev6.R;
import com.example.bootcampodev6.databinding.FragmentSearchBinding;
import com.example.bootcampodev6.model.entity.GameType;
import com.example.bootcampodev6.ui.adapter.GameTypeRVAdapter;
import com.example.bootcampodev6.ui.adapter.SearchGameTypeRVAdapter;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);



        ArrayList<GameType> gameTypes = new ArrayList<>();

        GameType gameType1 = new GameType(1,"INDIE","light_bulb","game_type_1");
        GameType gameType2 = new GameType(2,"FAMILY FRIENDLY","groups","game_type_1");
        GameType gameType3 = new GameType(3,"CLASSICS","joypad","game_type_2");
        GameType gameType4 = new GameType(4,"SHOOTERS","space_gun","game_type_2");
        GameType gameType5 = new GameType(5,"SPORTS","sports","game_type_3");
        GameType gameType6 = new GameType(6,"ACTION & ADVENTURE","ship","game_type_3");
        GameType gameType7 = new GameType(7,"PLATFORMERS","island","game_type_4");
        GameType gameType8 = new GameType(8,"FIGHTERS & BRAWLERS","boxing_gloves_punch_fight","game_type_4");

        gameTypes.add(gameType1);
        gameTypes.add(gameType2);
        gameTypes.add(gameType3);
        gameTypes.add(gameType4);
        gameTypes.add(gameType5);
        gameTypes.add(gameType6);
        gameTypes.add(gameType7);
        gameTypes.add(gameType8);

        binding.searchGameTypeRV
                .setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        SearchGameTypeRVAdapter searchGameTypeRVAdapter = new SearchGameTypeRVAdapter(gameTypes,requireContext());
        binding.searchGameTypeRV.setAdapter(searchGameTypeRVAdapter);






        return binding.getRoot();
    }
}