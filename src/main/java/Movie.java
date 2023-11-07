public class Movie {

    String nameOfTheMovie;
    String nameOfTheDirectors;
    int durationInMinutes;
    int releaseYear;


    public Movie(String nameOfTheMovie, String nameOfTheDirectors, int durationInMinutes, int releaseYear){

        this.nameOfTheMovie = nameOfTheMovie;
        this.nameOfTheDirectors = nameOfTheDirectors;
        this.durationInMinutes = durationInMinutes;
        this.releaseYear = releaseYear;

    }

    public void getMovieDetails(){

        System.out.println("Movie: " + nameOfTheMovie + "\n" + "Directory: " + nameOfTheDirectors +
        "\n" + "Movie duration: " + durationInMinutes + " minutes" + "\n" + "Release date: "+ releaseYear + "\n");

    }

}
