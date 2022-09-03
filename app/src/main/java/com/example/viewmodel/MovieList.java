package com.example.viewmodel;

import com.example.viewmodel.modal.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    List<Movie> movieList = new ArrayList<>();


  public  List<Movie> generateMovieList(){
        movieList.add(new Movie("Avenger 1",8,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        movieList.add(new Movie("Avenger 2",7,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        movieList.add(new Movie("Avenger 3",6,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        movieList.add(new Movie("Avenger 4",5,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        movieList.add(new Movie("Avenger 5",4,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        movieList.add(new Movie("Avenger 6",3,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        movieList.add(new Movie("Avenger 7",2,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        movieList.add(new Movie("Avenger 8",1,"https://images.unsplash.com/photo-1654671192969-3724d102f652?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        movieList.add(new Movie("Captain America",5,"https://img.republicworld.com/republic-prod/stories/images/xxhdpi/clojjyzjkyhdlg0m_1657215853.jpeg"));
        movieList.add(new Movie("Captain America 1",6,"https://img.republicworld.com/republic-prod/stories/images/xxhdpi/clojjyzjkyhdlg0m_1657215853.jpeg"));
        movieList.add(new Movie("Captain America 2",1,"https://img.republicworld.com/republic-prod/stories/images/xxhdpi/clojjyzjkyhdlg0m_1657215853.jpeg"));
        movieList.add(new Movie("Captain America 3",4,"https://img.republicworld.com/republic-prod/stories/images/xxhdpi/clojjyzjkyhdlg0m_1657215853.jpeg"));
        movieList.add(new Movie("SpiderMan",8,"https://blog.playstation.com/tachyon/2022/06/0c3c20a8d8514501524a0859461f391572ea6e61.jpg?resize=1088%2C612&crop_strategy=smart"));

        return movieList;
    }

}
