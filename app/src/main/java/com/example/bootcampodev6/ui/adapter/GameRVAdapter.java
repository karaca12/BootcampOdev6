package com.example.bootcampodev6.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcampodev6.databinding.GameCardDesignBinding;
import com.example.bootcampodev6.model.entity.Game;

import java.util.List;

public class GameRVAdapter extends RecyclerView.Adapter<GameRVAdapter.CardDesignHolder> {

    private List<Game> games;
    private Context mContext;

    public GameRVAdapter(List<Game> games, Context mContext) {
        this.games = games;
        this.mContext = mContext;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder{
        private GameCardDesignBinding designBinding;

        public CardDesignHolder(GameCardDesignBinding designBinding) {
            super(designBinding.getRoot());
            this.designBinding = designBinding;
        }
    }



    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        GameCardDesignBinding binding =
                GameCardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        Game game = games.get(position);
        GameCardDesignBinding designBinding = holder.designBinding;

        designBinding.imageViewGameCard
                .setImageResource(mContext.getResources()
                        .getIdentifier(game.getImage(),
                                "drawable",
                                mContext.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return games.size();
    }

}
