package org.lld.designpatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        File movie1 = new File("Godfather");
        movieDirectory.add(movie1);

        Directory comedyMovies = new Directory("comedy");
        File movie2 = new File("The Hangover");
        File movie3 = new File("Bhagam Bhag");
        comedyMovies.add(movie2);
        comedyMovies.add(movie3);
        movieDirectory.add(comedyMovies);

        movieDirectory.ls();
    }
}
