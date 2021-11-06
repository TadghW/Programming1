package movieRatings;

public class movie {
    
    private String title;
    private String genre;
    private int rating;

    movie() {
        this.title = "undefined";
        this.genre = "undefined";
        this.rating = 0;
    }

    movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void playIt(){
        System.out.println(this.title + "- Now playing");
    }

    @Override
    public String toString(){
        return this.title + this.genre + String.valueOf(this.rating);
    }
}
