package org.example;

public class Movies {
    private final String title;
    private final double rating;

    public Movies(String title, double rating){
        this.title = title;
        this.rating = rating;
    }
    public String getTitle(){return title;};
    public double getRating(){return rating;};

    @Override
    public String toString(){
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
