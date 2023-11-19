package com.example.bootcampodev6.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcampodev6.databinding.GameTypeCardDesignBinding;
import com.example.bootcampodev6.databinding.SearchGameTypeCardDesignBinding;
import com.example.bootcampodev6.model.entity.GameType;

import java.util.List;

public class SearchGameTypeRVAdapter extends RecyclerView.Adapter<SearchGameTypeRVAdapter.CardDesignHolder> {

    private List<GameType> gameTypes;
    private Context mContext;

    public SearchGameTypeRVAdapter(List<GameType> gameTypes, Context mContext) {
        this.gameTypes = gameTypes;
        this.mContext = mContext;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder {
        private SearchGameTypeCardDesignBinding designBinding;

        public CardDesignHolder(SearchGameTypeCardDesignBinding designBinding) {
            super(designBinding.getRoot());
            this.designBinding = designBinding;
        }
    }


    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SearchGameTypeCardDesignBinding binding =
                SearchGameTypeCardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        GameType gameType = gameTypes.get(position);
        SearchGameTypeCardDesignBinding designBinding = holder.designBinding;

        designBinding.imageViewSearchGameType
                .setImageResource(mContext.getResources()
                        .getIdentifier(gameType.getImage(),
                                "drawable",
                                mContext.getPackageName()));

        designBinding.textViewSearchGameType
                .setText(gameType.getName());

        int colorResourceId = mContext.getResources().getIdentifier(
                gameType.getColor(), "color", mContext.getPackageName());
        designBinding.searchGameTypeCard.setCardBackgroundColor(mContext.getResources().getColor(colorResourceId));

    }

    @Override
    public int getItemCount() {
        return gameTypes.size();
    }

}
