package com.example.toni.proyectorbnofragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Toni on 04/05/2016.
 */
public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.LibroViewHolder> {

    private List<Libro> items;

    public LibroAdapter(List<Libro> items) {
        this.items = items;
    }

    @Override
    public LibroAdapter.LibroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        return new LibroViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LibroAdapter.LibroViewHolder holder, int position) {
        holder.explicacion.setText(items.get(position).getExplicacion());
        holder.year.setText(items.get(position).getYear());
        holder.titulo.setText(items.get(position).getTitulo());
        holder.autor.setText(items.get(position).getAutor());
        holder.portada.setImageResource(items.get(position).getPortada());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class LibroViewHolder extends RecyclerView.ViewHolder {

        public ImageView portada;
        public TextView autor;
        public TextView titulo;
        public TextView year;
        public TextView explicacion;

        public LibroViewHolder(View itemView) {
            super(itemView);

            portada =(ImageView) itemView.findViewById(R.id.portada);
            autor = (TextView) itemView.findViewById(R.id.autor);
            titulo = (TextView) itemView.findViewById(R.id.titulo);
            year = (TextView) itemView.findViewById(R.id.year);
            explicacion = (TextView) itemView.findViewById(R.id.explicacion);
        }
    }
}
