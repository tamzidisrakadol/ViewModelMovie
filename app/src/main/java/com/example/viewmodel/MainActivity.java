package com.example.viewmodel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.viewmodel.adapter.MovieAdapter;
import com.example.viewmodel.modal.Movie;
import com.example.viewmodel.modelView.ShareViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ShareViewModel shareViewModel;
    MovieList movieList = new MovieList();
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    navController= Navigation.findNavController(this,R.id.navHostFragment);
    NavigationUI.setupActionBarWithNavController(this,navController);
    shareViewModel=new ViewModelProvider(this).get(ShareViewModel.class);

    }

    @Override
    public boolean onSupportNavigateUp() {
        navController.navigateUp();
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.addbtn){
            addMovie();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void addMovie() {
        Movie movie = new Movie("Spider Man Return",8,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80");
        shareViewModel.addMovie(movie);

    }

}