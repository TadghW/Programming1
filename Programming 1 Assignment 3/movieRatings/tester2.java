package movieRatings;

import java.util.Scanner;

public class tester2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        movie[] movieList = new movie[3];

        for(int i=0; i < movieList.length; i++) {
            movie movie = new movie();
            movieList[i] = movie; 
        }

        for(int i=0; i < movieList.length; i++) {
            System.out.println("Enter title of movie " + (i+1));
            String title = sc.nextLine();
            System.out.println("Enter genre of movie " + (i+1));
            String genre = sc.nextLine();
            System.out.println("Score the movie between 1 and 10");
            int rating = Integer.parseInt(sc.nextLine());
            movieList[i].setTitle(title);
            movieList[i].setGenre(genre);
            movieList[i].setRating(rating);
        }

        for(int i=0; i < movieList.length; i++) {
            System.out.println("---------- Movie " + (i + 1) + " ----------");
            System.out.println("Movie Title: " + movieList[i].getTitle());
            System.out.println("Movie Genre: " + movieList[i].getGenre());
            System.out.println("Movie Rating: " + movieList[i].getRating());
            movieList[i].playIt();
        }

        sc.close();

    }
    
}
