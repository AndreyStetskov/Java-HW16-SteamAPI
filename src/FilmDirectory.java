import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class FilmDirectory {
    public static void add(Set<Film> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter title of the film");
        String name = scanner.nextLine();

        System.out.println("Enter year of release of the film");
        int release = scanner.nextInt();

        System.out.println("Enter country of the film production");
        String country = scanner.nextLine();

        System.out.println("Enter genre of the film");
        String genre = scanner.nextLine();

        System.out.println("Enter IMDb film rating");
        double rating = scanner.nextDouble();

        System.out.println("Enter a film director. If they are more than one, enter them separated by commas and a space");
        String director = scanner.nextLine();
        List<String> directors = List.of(director.split(", "));

        System.out.println("Enter a film producer. If they are more than one, enter them separated by commas and a spice");
        String producer = scanner.nextLine();
        List<String> producers = List.of(producer.split(", "));

        System.out.println("Enter a scriptwriter of the film. If they are more than one, enter them separated by commas and a spice");
        String writer = scanner.nextLine();
        List<String> writers = List.of(writer.split(", "));

        System.out.println("Enter actors of the film. Enter them separated by commas and a spice");
        String actor = scanner.nextLine();
        List<String> actors = List.of(actor.split(", "));

        System.out.println("Give a brief description of the film");
        String description = scanner.nextLine();

        Film title = new Film(name, release, country, genre, rating, directors, producers, writers, actors, description);

        list.add(title);
    }

    public static void remove(Set<Film> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter title of the film you want to remove");
        String name = scanner.nextLine();

        list.removeIf(film -> film.getName().equals(name));
    }

    public static void updatingInformation (Set<Film> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose film you want to change information");
        String name = scanner.nextLine();

        System.out.println("Write information you want to change about the film");
        String newInformation = scanner.nextLine();

        list.stream().filter(data -> Objects.equals(data.getName(), name)).findFirst().get().setDescription(newInformation);
    }

    public static void search (Set<Film> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a search criterion. If criteria are more than one, enter them separated by commas and a spice");
        System.out.println("1 - title of a film");
        System.out.println("2 - year of release of a film");
        System.out.println("3 - country of a film production");
        System.out.println("4 - genre of a film");
        System.out.println("5 - rating of a film");
        System.out.println("6 - a film director");
        System.out.println("7 - a film producer");
        System.out.println("8 - a scriptwriter");
        System.out.println("9 - a actor");

        String selection = scanner.nextLine();
        List<String> criteria = List.of(selection.split(", "));

        for (String s : criteria) {
            int criterion = Integer.parseInt(s);
            if (criterion == 1) {
                System.out.println("Enter title of the film");
                String name = scanner.nextLine();

                Set<Film> result = list.stream().filter(title -> Objects.equals(title.getName(), name)).collect(Collectors.toSet());
            }

            if (criterion == 2) {
                System.out.println("Enter year from");
                int yearFrom = scanner.nextInt();

                System.out.println("Enter year to");
                int yearTo = scanner.nextInt();

                Set<Film> result = list.stream().filter(year -> year.getRelease() >= yearFrom && year.getRelease() <= yearTo).collect(Collectors.toSet());
            }

            if (criterion == 3) {
                System.out.println("Enter a country of a film production");
                String country = scanner.nextLine();

                Set<Film> result = list.stream().filter(state -> Objects.equals(state.getCountry(), country)).collect(Collectors.toSet());
            }

            if (criterion == 4) {
                System.out.println("Enter a genre of film. If there are genres more than one, enter them separated by commas and a space");
                String genre = scanner.nextLine();

                Set<Film> result = list.stream().filter(type -> genre.contains(type.getGenre())).collect(Collectors.toSet());
            }

            if (criterion == 5) {
                System.out.println("Enter rating from");
                double ratingFrom = scanner.nextInt();

                System.out.println("Enter rating to");
                double ratingTo = scanner.nextInt();

                Set<Film> result = list.stream().filter(rating -> rating.getRating() >= ratingFrom && rating.getRating() <= ratingTo).collect(Collectors.toSet());
            }

//            if (criterion == 6) {
//                System.out.println("Enter some film director. If they are more than one, enter them separated by commas and a space");
//                String director = scanner.nextLine();
//
//                List<Film> directors = list.stream().flatMap(dir -> dir.getDirectors().)
//
//                Set<Film> result = list.stream().filter(d -> {d.getDirectors().}).collect(Collectors.toSet());
//            }
        }
    }
}
