package az.edu.turing.Task;

public class Movie {
    public String name;
    public double rating;

    public Movie(String name, double rating) {
        this.name = name;
        this.rating =rating;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}