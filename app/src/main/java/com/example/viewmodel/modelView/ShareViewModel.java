package com.example.viewmodel.modelView;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import com.example.viewmodel.MovieList;
import com.example.viewmodel.modal.Movie;

import java.util.List;

public class ShareViewModel extends ViewModel {
    private MutableLiveData<List<Movie>> mutableMovieList = new MutableLiveData<>();
    private MutableLiveData<Movie> mutableLiveData = new MutableLiveData<>();
    MovieList movieList = new MovieList();


    public LiveData<Movie> getMovie(){
        return mutableLiveData;
    }

    public void setMovie(int position){
         Movie movie = mutableMovieList.getValue().get(position);
            mutableLiveData.setValue(movie);
    }
    public void addMovie(Movie movie){
        if (mutableMovieList.getValue() != null){
            List<Movie> newMovie = mutableMovieList.getValue();
            newMovie.add(movie);
            mutableMovieList.setValue(newMovie);

        }
        List<Movie> NewmoviesAdd = movieList.generateMovieList();
        NewmoviesAdd.add(movie);
        mutableMovieList.setValue(NewmoviesAdd);
    }

    public LiveData<List<Movie>> getMovieList(){
        if (mutableMovieList.getValue()==null){
            new LoadMovies().execute();
        }
        return mutableMovieList;
    }

    class LoadMovies extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            List<Movie> moviesAdd = movieList.generateMovieList();
            mutableMovieList.postValue(moviesAdd);
        }
    }
}
