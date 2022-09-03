package com.example.viewmodel;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.viewmodel.modal.Movie;
import com.example.viewmodel.modelView.ShareViewModel;


public class Detailsfragment extends Fragment {
    TextView nameText,ratingText;
    NavController navController;
    ShareViewModel shareViewModel;

    public Detailsfragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController= Navigation.findNavController(view);
        nameText=view.findViewById(R.id.nameText);
        ratingText=view.findViewById(R.id.ratingText);
        shareViewModel=new ViewModelProvider(requireActivity()).get(ShareViewModel.class);
        shareViewModel.getMovie().observe(getViewLifecycleOwner(), new Observer<Movie>() {
            @Override
            public void onChanged(Movie movie) {
                updateUi(movie);
            }
        });

    }

    private void updateUi(Movie movie) {
        nameText.setText(movie.getMovieName());
        ratingText.setText(String.valueOf(movie.getRating()+"/10"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailsfragment, container, false);
    }
}