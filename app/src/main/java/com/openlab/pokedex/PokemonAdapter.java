package com.openlab.pokedex;

import android.content.Context;
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

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonView>{

    private ArrayList<Pokemon> pokemones;
    private Context context;

    public PokemonAdapter(ArrayList<Pokemon> pokemones, Context context) {
        this.pokemones = pokemones;
        this.context = context;
    }

    @Override
    public PokemonView onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_pokemon, parent, false);
        PokemonView pokemonView = new PokemonView(view);
        return  pokemonView;
    }

    @Override
    public void onBindViewHolder(PokemonView holder, int position) {
        holder.imgPokemon.setImageResource(pokemones.get(position).getImagen());
        holder.tvPokemon.setText(pokemones.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return pokemones.size();
    }

    public class PokemonView extends RecyclerView.ViewHolder{

        ImageView imgPokemon;
        TextView tvPokemon;

        public PokemonView(View itemView) {
            super(itemView);

            imgPokemon = (ImageView) itemView.findViewById(R.id.img_pokemon);
            tvPokemon = (TextView) itemView.findViewById(R.id.tv_pokemon);
        }
    }
}
