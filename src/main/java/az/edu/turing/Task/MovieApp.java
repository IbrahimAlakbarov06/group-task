package az.edu.turing.Task;

import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie[] movie = new Movie[3];

        while (true) {
            System.out.print("Enter: ");
            int op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    input(movie);
                    break;
                case 2:
                    show(movie);
                    break;
                case 0:
                    System.out.println("exit");
                    return;
                case 3:
                    add(movie);
                    break;
                case 4:
                    findMaxMin(movie);
                    break;
                case 5:
                    findMovie(movie);
                    break;
                case 6:
                    changeRating(movie);
                    break;
                case 7:
                    deleteMovie(movie);
                    break;
                case 8:
                    sortingRating(movie);
                    break;
                default:
                    System.out.println("Error");


            }
        }
    }

    public static void input(Movie[] movie) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + "ci name: ");
            String name = scanner.nextLine();
            System.out.print(i + 1 + "ci rating: ");
            double rating = scanner.nextDouble();
            scanner.nextLine();
            movie[i] = new Movie(name, rating);
        }
    }

    public static void show(Movie[] movie) {
        for (Movie movies : movie) {
            System.out.println("name: " + movies.name);
            System.out.println("rating: " + movies.rating);
        }
    }

    public static void add(Movie[] movie) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        Movie[] newMovies = new Movie[size + movie.length];

        for (int i = 0; i < movie.length; i++) {
            newMovies[i] = movie[i];
        }

        for (int i = movie.length; i < newMovies.length; i++) {
            System.out.print(i + 1 + "ci name: ");
            String name = scanner.nextLine();
            System.out.print(i + 1 + "ci rating: ");
            double rating = scanner.nextDouble();
            scanner.nextLine();
            newMovies[i] = new Movie(name, rating);
        }
        System.out.println(Arrays.toString(newMovies));
    }

    public static void findMaxMin(Movie[] newMovies) {
        double sum = 0;
        for (Movie newMovie : newMovies) {
            sum += newMovie.rating;

        }
        double max = 0;

        double avg = sum / newMovies.length;
        System.out.println("Average: " + avg);
        for (Movie newMovie : newMovies) {
            if (max < newMovie.rating) {
                max = newMovie.rating;
            }
        }
        System.out.println("Max: " + max);
        double min = 10;
        for (Movie newMovie : newMovies) {
            if (min > newMovie.rating) {
                min = newMovie.rating;
            }
        }
        System.out.println("Min: " + min);
    }

    public static void findMovie(Movie[] newMovies) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String find = scanner.nextLine();
        for (int i = 0; i < newMovies.length; i++) {
            if (find.equals(newMovies[i].name)) {
                System.out.println(find + "--> rating: " + newMovies[i].rating);
                break;
            } else if (i <= newMovies.length - 1) {
                System.out.println("Movie is not found");
                break;
            }
        }
    }

    public static void changeRating(Movie[] newMovies) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String find = scanner.nextLine();

        boolean found = false;

        for (Movie newMovie : newMovies) {
            if (newMovie != null && find.equals(newMovie.name)) {
                System.out.print("Enter new rating: ");
                double newRating = scanner.nextDouble();
                newMovie.rating = newRating;
                System.out.println(find + "'s new rating is: " + newMovie.rating);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Movie is not found");
        }
    }


    public static void deleteMovie(Movie[] newMovies) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String find = scanner.nextLine();
        int count = 0;
        for (Movie newMovie : newMovies) {
            if (find.equals(newMovie.name)) {
                count++;
            }
        }
        Movie[] uptatedMovie = new Movie[newMovies.length - count];
        for (int i = 0; i < uptatedMovie.length; i++) {
            if (find.equals(newMovies[i].name)) {
                uptatedMovie[i] = newMovies[i + 1];

                System.out.println("Movie '" + find + "' has been deleted.");

            } else {
                uptatedMovie[i] = newMovies[i];
            }
        }

    }


    public static void sortingRating(Movie[] uptatedMovie) {
        for (int i = 0; i < uptatedMovie.length - 1; i++) {
            for (int j = i + 1; j < uptatedMovie.length; j++) {
                if (uptatedMovie[i] != null && uptatedMovie[j] != null && uptatedMovie[i].rating > uptatedMovie[j].rating) {
                    double temp = uptatedMovie[i].rating;
                    uptatedMovie[i].rating = uptatedMovie[j].rating;
                    uptatedMovie[j].rating = temp;

                    String tempName = uptatedMovie[i].name;
                    uptatedMovie[i].name = uptatedMovie[j].name;
                    uptatedMovie[j].name = tempName;
                }
            }
        }

        for (Movie movie : uptatedMovie) {
            if (movie != null) {
                System.out.println(movie.name + ": " + movie.rating);
            }
        }
    }


}