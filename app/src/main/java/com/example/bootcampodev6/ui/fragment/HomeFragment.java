package com.example.bootcampodev6.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcampodev6.databinding.FragmentHomeBinding;
import com.example.bootcampodev6.model.entity.Game;
import com.example.bootcampodev6.model.entity.GameType;
import com.example.bootcampodev6.ui.adapter.GameRVAdapter;
import com.example.bootcampodev6.ui.adapter.GameTypeRVAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private boolean control = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        ArrayList<Game> gamesHeadliner = new ArrayList<>();

        Game game_headliner_1 = new Game(1, "Assasin's Creed Origins", "assasins_creed_origins");
        Game game_headliner_2 = new Game(2, "Exoprimal", "exoprimal");
        Game game_headliner_3 = new Game(3, "Tunic", "tunic");
        Game game_headliner_4 = new Game(4, "Battletoads", "battletoads");
        Game game_headliner_5 = new Game(5, "Among Us", "among_us");

        gamesHeadliner.add(game_headliner_1);
        gamesHeadliner.add(game_headliner_2);
        gamesHeadliner.add(game_headliner_3);
        gamesHeadliner.add(game_headliner_4);
        gamesHeadliner.add(game_headliner_5);

        binding.game1RV
                .setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        GameRVAdapter gameRVAdapterHeadliner = new GameRVAdapter(gamesHeadliner, requireContext());
        binding.game1RV.setAdapter(gameRVAdapterHeadliner);


        ArrayList<Game> gamesRecently = new ArrayList<>();

        Game game_recent_1 = new Game(1, "Persona 5 Tactica", "persona_5_tactica");
        Game game_recent_2 = new Game(2, "Coral Island", "coral_island");
        Game game_recent_3 = new Game(3, "Spirittea", "spirittea");
        Game game_recent_4 = new Game(4, "Wild Hearts", "wild_hearts");
        Game game_recent_5 = new Game(5, "Dungeons 4", "dungeons_4");
        Game game_recent_6 = new Game(6, "Like a Dragon Gaiden: The Man Who Erased His Name", "dragon_gaiden");
        Game game_recent_7 = new Game(7, "Football Manager 24", "football_manager_24");
        Game game_recent_8 = new Game(8, "Thirsty Suitors", "thirsty_suitors");
        Game game_recent_9 = new Game(9, "Wartales", "wartales");
        Game game_recent_10 = new Game(10, "Head Bangers", "head_bangers");

        gamesRecently.add(game_recent_1);
        gamesRecently.add(game_recent_2);
        gamesRecently.add(game_recent_3);
        gamesRecently.add(game_recent_4);
        gamesRecently.add(game_recent_5);
        gamesRecently.add(game_recent_6);
        gamesRecently.add(game_recent_7);
        gamesRecently.add(game_recent_8);
        gamesRecently.add(game_recent_9);
        gamesRecently.add(game_recent_10);

        binding.game2RV
                .setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        GameRVAdapter gameRVAdapterRecent = new GameRVAdapter(gamesRecently, requireContext());
        binding.game2RV.setAdapter(gameRVAdapterRecent);


        ArrayList<Game> gamesMostPopular = new ArrayList<>();

        Game game_popular_1 = new Game(1, "Grand Theft Auto", "gta_5");
        Game game_popular_2 = new Game(2, "Minecraft", "minecraft");
        Game game_popular_3 = new Game(3, "Forza Horizon 5", "forza_horizon_5");
        Game game_popular_4 = new Game(4, "Rainbow 6 Siege", "rainbow_6_siege");
        Game game_popular_5 = new Game(5, "FIFA 23", "fifa_23");
        Game game_popular_6 = new Game(6, "Starfield", "starfield");
        Game game_popular_7 = new Game(7, "Halo Infinite", "halo_infinite");
        Game game_popular_8 = new Game(8, "Farming Simulator 22", "farming_simulator_22");
        Game game_popular_9 = new Game(9, "Sea of Thieves", "sea_of_thieves");
        Game game_popular_10 = new Game(10, "Mortal Kombat 11", "mortal_kombat_11");

        gamesMostPopular.add(game_popular_1);
        gamesMostPopular.add(game_popular_2);
        gamesMostPopular.add(game_popular_3);
        gamesMostPopular.add(game_popular_4);
        gamesMostPopular.add(game_popular_5);
        gamesMostPopular.add(game_popular_6);
        gamesMostPopular.add(game_popular_7);
        gamesMostPopular.add(game_popular_8);
        gamesMostPopular.add(game_popular_9);
        gamesMostPopular.add(game_popular_10);

        binding.game3RV
                .setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        GameRVAdapter gameRVAdapterPopular = new GameRVAdapter(gamesMostPopular, requireContext());
        binding.game3RV.setAdapter(gameRVAdapterPopular);



        ArrayList<Game> gamesDay1Releases = new ArrayList<>();

        Game game_day1Releases_1 = new Game(1, "Starfield", "starfield");
        Game game_day1Releases_2 = new Game(2, "Persona 5 Tactica", "persona_5_tactica");
        Game game_day1Releases_3 = new Game(3, "Coral Island", "coral_island");
        Game game_day1Releases_4 = new Game(4, "Dungeons 4", "dungeons_4");
        Game game_day1Releases_5 = new Game(5, "Lonely Mountaions", "lonely_mountains");
        Game game_day1Releases_6 = new Game(6, "A Plague Tale: Requiem", "plague_tale_requiem");
        Game game_day1Releases_7 = new Game(7, "Head Bangers", "head_bangers");
        Game game_day1Releases_8 = new Game(8, "Jusant", "jusant");
        Game game_day1Releases_9 = new Game(9, "SpiderHeck", "spiderheck");

        gamesDay1Releases.add(game_day1Releases_1);
        gamesDay1Releases.add(game_day1Releases_2);
        gamesDay1Releases.add(game_day1Releases_3);
        gamesDay1Releases.add(game_day1Releases_4);
        gamesDay1Releases.add(game_day1Releases_5);
        gamesDay1Releases.add(game_day1Releases_6);
        gamesDay1Releases.add(game_day1Releases_7);
        gamesDay1Releases.add(game_day1Releases_8);
        gamesDay1Releases.add(game_day1Releases_9);

        binding.game4RV
                .setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        GameRVAdapter gameRVAdapterDay1Releases = new GameRVAdapter(gamesDay1Releases, requireContext());
        binding.game4RV.setAdapter(gameRVAdapterDay1Releases);



        ArrayList<Game> gamesLeavingSoon = new ArrayList<>();

        Game game_leavingSoon_1 = new Game(1, "Disc Room", "disc_room");
        Game game_leavingSoon_2 = new Game(2, "Grid", "grid");
        Game game_leavingSoon_3 = new Game(3, "Battlefield Bad Company 2", "bf_bc_2");
        Game game_leavingSoon_4 = new Game(4, "Battlefield Bad Company", "bf_bc");
        Game game_leavingSoon_5 = new Game(5, "Eastward", "eastward");
        Game game_leavingSoon_6 = new Game(6, "Battlefield 1943", "bf_1943");

        gamesLeavingSoon.add(game_leavingSoon_1);
        gamesLeavingSoon.add(game_leavingSoon_2);
        gamesLeavingSoon.add(game_leavingSoon_3);
        gamesLeavingSoon.add(game_leavingSoon_4);
        gamesLeavingSoon.add(game_leavingSoon_5);
        gamesLeavingSoon.add(game_leavingSoon_6);

        binding.game5RV
                .setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        GameRVAdapter gameRVAdapterLeavingSoon = new GameRVAdapter(gamesLeavingSoon, requireContext());
        binding.game5RV.setAdapter(gameRVAdapterLeavingSoon);


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

        binding.gameTypeRV
                .setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        GameTypeRVAdapter gameTypeRVAdapter = new GameTypeRVAdapter(gameTypes,requireContext());
        binding.gameTypeRV.setAdapter(gameTypeRVAdapter);


        return binding.getRoot();
    }
}