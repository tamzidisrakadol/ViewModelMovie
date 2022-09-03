package com.example.viewmodel.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewmodel.R;
import com.example.viewmodel.modal.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.Viewholder> {
    Context context;
    List<Movie> movieList;
    ItemClickListner itemClickListner;

    public MovieAdapter(Context context, List<Movie> movieList, ItemClickListner itemClickListner) {
        this.context = context;
        this.movieList = movieList;
        this.itemClickListner=itemClickListner;
    }

    @NonNull
    @Override
    public MovieAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movielayout,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.Viewholder holder, int position) {
    Movie movie = movieList.get(position);
    holder.movieNameText.setText(movie.getMovieName());
    holder.movieRatingText.setText(movie.getRating()+"/10");

        Picasso.get().load(movie.getImgUrl()).into(holder.movieImg);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView movieNameText,movieRatingText;
        ImageView movieImg;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            movieNameText=itemView.findViewById(R.id.movieNameText);
            movieRatingText=itemView.findViewById(R.id.movieRatingText);
            movieImg=itemView.findViewById(R.id.movieImg);

            itemView.setOnClickListener(v ->
                    itemClickListner.onItemClick(getAdapterPosition()));
        }
    }
}
