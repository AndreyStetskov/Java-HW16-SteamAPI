import java.util.List;
import java.util.Objects;

public class Film implements Comparable <Film>{
    private String name;
    private int release;
    private String country;
    private String genre;
    private double rating;
    private List<String> directors;
    private List<String> producers;
    private List<String> writers;
    private List<String> actors;
    private String description;


    public Film(String name, int release, String country, String genre, double rating, List<String> directors, List<String> producers, List<String> writers, List<String> actors, String description) {
        this.name = name;
        this.release = release;
        this.country = country;
        this.genre = genre;
        this.rating = rating;
        this.directors = directors;
        this.producers = producers;
        this.writers = writers;
        this.actors = actors;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public List<String> getProducers() {
        return producers;
    }

    public void setProducers(List<String> producers) {
        this.producers = producers;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return release == film.release && Double.compare(film.rating, rating) == 0 && Objects.equals(name, film.name) && Objects.equals(country, film.country) && Objects.equals(genre, film.genre) && Objects.equals(directors, film.directors) && Objects.equals(producers, film.producers) && Objects.equals(writers, film.writers) && Objects.equals(actors, film.actors) && Objects.equals(description, film.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, release, country, genre, rating, directors, producers, writers, actors, description);
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", directors=" + directors +
                ", producers=" + producers +
                ", writers=" + writers +
                ", actors=" + actors +
                ", description='" + description + '\'' +
                '}';
    }


    @Override
    public int compareTo(Film o) {
        if (rating < o.getRating()) {
            return -1;
        } else if (rating > o.getRating()) {
            return 1;
        } else {
            if (release > o.getRelease()) {
                return 1;
            } else if (release < o.getRelease()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
