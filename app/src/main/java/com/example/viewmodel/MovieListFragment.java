package com.example.viewmodel;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.viewmodel.adapter.ItemClickListner;
import com.example.viewmodel.adapter.MovieAdapter;
import com.example.viewmodel.modal.Movie;
import com.example.viewmodel.modelView.ShareViewModel;

import java.util.List;


public class MovieListFragment extends Fragment implements ItemClickListner {

    RecyclerView recyclerView;
    MovieAdapter movieAdapter;
    private NavController navController;
    ShareViewModel shareViewModel;
    MovieList movieList = new MovieList();
    List<Movie> moviesAll = movieList.generateMovieList();


    public MovieListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController= Navigation.findNavController(view);
        recyclerView =view.findViewById(R.id.recyclerView);
        movieAdapter = new MovieAdapter(getContext(),moviesAll,this);


        shareViewModel=new ViewModelProvider(requireActivity()).get(ShareViewModel.class);
        shareViewModel.getMovieList().observe(getViewLifecycleOwner(), new Observer<List<Movie>>() {
            @Override
            public void onChanged(List<Movie> movies) {
          /*  moviesAll.clear();
            moviesAll.addAll(movies);
            movieAdapter.notifyDataSetChanged();*/

                recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
                recyclerView.setAdapter(movieAdapter);
                movieAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_list, container, false);
    }

    @Override
    public void onItemClick(int position) {
       // Toast.makeText(getContext(), "pos "+position, Toast.LENGTH_SHORT).show();
        shareViewModel.setMovie(position);
        navController.navigate(R.id.action_movieListFragment_to_detailsfragment2);
    }
}