package com.openlab.pokedex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 06/05/2017.
 */

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonView> {

    private ArrayList<Pokemon> pokemones;
    private Activity activity;

    public PokemonAdapter(ArrayList<Pokemon> pokemones, Activity activity) {
        this.pokemones = pokemones;
        this.activity = activity;
    }

    @Override
    public PokemonView onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = inflater.inflate(R.layout.item_pokemon, parent, false);
        PokemonView pokemonView = new PokemonView(view);
        return pokemonView;
    }

    @Override
    public void onBindViewHolder(PokemonView holder, final int position) {
        holder.imgPokemon.setImageResource(pokemones.get(position).getImagen());
        holder.tvPokemon.setText(pokemones.get(position).getNombre());
        holder.imgPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, PokemonDetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("pokemon", pokemones.get(position));
                intent.putExtras(bundle);

                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pokemones.size();
    }

    public class PokemonView extends RecyclerView.ViewHolder {

        ImageView imgPokemon;
        TextView tvPokemon;

        public PokemonView(View itemView) {
            super(itemView);

            imgPokemon = (ImageView) itemView.findViewById(R.id.img_pokemon);
            tvPokemon = (TextView) itemView.findViewById(R.id.tv_pokemon);
        }
    }
}
