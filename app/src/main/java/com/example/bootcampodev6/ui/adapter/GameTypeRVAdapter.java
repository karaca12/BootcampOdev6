package com.example.bootcampodev6.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcampodev6.databinding.GameCardDesignBinding;
import com.example.bootcampodev6.databinding.GameTypeCardDesignBinding;
import com.example.bootcampodev6.model.entity.GameType;

import java.util.List;

public class GameTypeRVAdapter extends RecyclerView.Adapter<GameTypeRVAdapter.CardDesignHolder> {

    private List<GameType> gameTypes;
    private Context mContext;

    public GameTypeRVAdapter(List<GameType> gameTypes, Context mContext) {
        this.gameTypes = gameTypes;
        this.mContext = mContext;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder {
        private GameTypeCardDesignBinding designBinding;

        public CardDesignHolder(GameTypeCardDesignBinding designBinding) {
            super(designBinding.getRoot());
            this.designBinding = designBinding;
        }
    }


    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        GameTypeCardDesignBinding binding =
                GameTypeCardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        GameType gameType = gameTypes.get(position);
        GameTypeCardDesignBinding designBinding = holder.designBinding;

        designBinding.imageViewGameType
                .setImageResource(mContext.getResources()
                        .getIdentifier(gameType.getImage(),
                                "drawable",
                                mContext.getPackageName()));

        designBinding.textViewGameType
                .setText(gameType.getName());

        int colorResourceId = mContext.getResources().getIdentifier(
                gameType.getColor(), "color", mContext.getPackageName());
        designBinding.gameTypeCard.setCardBackgroundColor(mContext.getResources().getColor(colorResourceId));

    }

    @Override
    public int getItemCount() {
        return gameTypes.size();
    }

}
