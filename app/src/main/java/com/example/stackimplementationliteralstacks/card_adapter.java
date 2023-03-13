package com.example.stackimplementationliteralstacks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stackimplementationliteralstacks.databinding.CardBinding;

import java.util.ArrayList;
import java.util.List;

public class card_adapter extends RecyclerView.Adapter<card_adapter.myViewHolder>
{
    List<card> cardList = new ArrayList<>();

    public card_adapter(List<card> cardList)
    {
        this.cardList = cardList;
    }

    @NonNull
    @Override
    public card_adapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater li=(LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull card_adapter.myViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return cardList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
