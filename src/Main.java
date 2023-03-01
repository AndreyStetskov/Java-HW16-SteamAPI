import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class Main {
    public static void main(String[] args) {

        Set<Film> list = new TreeSet<>();
        Film shawshankRedemption = new Film("The Shawshank Redemption", 1994, "USA", "Drama", 9.3,
                List.of("Frank Darabont"),
                List.of("Liz Glotzer", "David V. Lester", "Niki Marvin"),
                List.of("Stephen King", "Frank Darabont"),
                List.of("Tim Robbins", "Morgan Freeman", "Bob Gunton", "William Sadler", "Clancy Brown"),
                "Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion."
        );
        Film godfather = new Film("The Godfather", 1972, "USA", "Crime", 9.2,
                List.of("Francis Ford Coppola"),
                List.of("Gray Frederickson", "Albert S. Ruddy"),
                List.of("Mario Puzo", "Francis Ford Coppola"),
                List.of("Marlon Brando", "Al Pacino", "James Caan", "Richard S. Castellano", "Robert Duvall"),
                "The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son."
        );
        Film darkKnight = new Film("The Dark Knight", 2008, "USA", "Action", 9.0,
                List.of("Christopher Nolan"),
                List.of("Kevin de la Noy", "Jordan Goldberg", "Benjamin Melniker", "Philip Lee", "Christopher Nolan", "Thomas Tull", "Michael E. Uslan"),
                List.of("Jonathan Nolan", "Christopher Nolan", "David S. Goyer", "Bob Kane"),
                List.of("Christian Bale", "Heath Ledger", "Aaron Eckhart", "Michael Caine", "Maggie Gyllenhaal"),
                "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice."
        );
        Film godfatherPartII = new Film("The Godfather Part II", 1974, "USA", "Crime", 9.0,
                List.of("Francis Ford Coppola"),
                List.of("Francis Ford Coppola", "Gray Frederickson", "Fred Roos", "Mona Skager"),
                List.of("Mario Puzo", "Francis Ford Coppola"),
                List.of("Al Pacino", "Robert Duvall", "Diane Keaton", "Robert De Niro", "John Cazale"),
                "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate."
        );
        Film twelveAngryMen = new Film("12 Angry Men", 1957, "USA", "Crime", 9.0,
                List.of("Sidney Lumet"),
                List.of("Henry Fonda", "George Justin", "Reginald Rose"),
                List.of("Reginald Rose"),
                List.of("Martin Balsam", "John Fiedler", "Lee J. Cobb", "E.G. Marshall", "Jack Klugman"),
                "The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict."
        );
        Film schindlersList = new Film("Schindler's List", 1993, "USA", "Biography", 8.9,
                List.of("Steven Spielberg"),
                List.of("Irving Glovin", "Kathleen Kennedy", "Branko Lustig", "Gerald R. Molen", "Robert Raymond", "Lew Rywin", "Steven Spielberg"),
                List.of("Thomas Keneally", "Steven Zaillian"),
                List.of("Liam Neeson", "Ben Kingsley", "Ralph Fiennes", "Caroline Goodall", "Jonathan Sagall"),
                "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis."
        );
        Film  lordOfThRings = new Film(" The Lord of the Rings: The Return of the King", 2003, "USA", "Action", 8.9,
                List.of("Peter Jackson"),
                List.of("Peter Jackson", "Michael Lynne", "Eric Monette", "Mark Ordesky", "Barrie M. Osborne", "Robert Shaye"),
                List.of("J.R.R. Tolkien", "Fran Walsh", "Philippa Boyens", "Peter Jackson"),
                List.of("TNoel Appleby", "Ali Astin", "Sean Astin", "David Aston", "John Bach"),
                "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring."
        );

        list.add(shawshankRedemption);
        list.add(godfather);
        list.add(darkKnight);
        list.add(godfatherPartII);
        list.add(twelveAngryMen);
        list.add(schindlersList);
        list.add(lordOfThRings);


        Application.start();
    }
}