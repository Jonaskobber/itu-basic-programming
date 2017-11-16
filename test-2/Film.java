import java.util.*;

public class Film
{
    protected String title;
    protected int year;
    protected ArrayList<Integer> ratings;
    
    public Film (String title, int year) {
        this.title = title;
        this.year = year;
        ratings = new ArrayList<>();
    }
    
    public void rate(int rating) {
        ratings.add(rating);
    }
    
    public void checkedRate(int rating) throws InvalidValueException {
        if (rating < 1 || rating > 10) {
            throw new InvalidValueException(rating);
        } else {
            rate(rating);
        }
    }
    
    protected int ratingSum() {
        int totalRating = 0;

        for(int rating : ratings) {
            totalRating += rating;
        }
        
        return totalRating;
    }
    
    public double score() {
        if (ratings.size() == 0) {
            throw new RuntimeException("*** " + title + " unrated!");
        }
        return (double) ratingSum() / ratings.size();
    }
    
    public void display() {
        System.out.println(title + "(" + year + ") [" + score() + "]");
    }
}
