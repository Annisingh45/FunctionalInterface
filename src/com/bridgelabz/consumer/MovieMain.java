package com.bridgelabz.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieMain {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Inception", "leopard", "elliot"));
        movieList.add(new Movie("Interstellar", "Paramount", "Nolan"));
        movieList.add(new Movie("The Matrix", "Warner Bros", "Wachowski"));
        movieList.add(new Movie("Avatar", "20th Century Fox", "Cameron"));
        movieList.add(new Movie("The Dark Knight", "Warner Bros", "Nolan"));
        movieList.add(new Movie("Titanic", "Paramount", "Cameron"));

        Consumer<Movie> consumer = (Movie movie) -> {
            System.out.println(movie.movieName);
            System.out.println(movie.heroineName);
            System.out.println(movie.heroName);
            System.out.println("------");
        };
        for (Movie movie : movieList)
            consumer.accept(movie);
    }
}
