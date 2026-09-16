package T3;

import java.util.Objects;

public class Movie {
    String title;
    int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Movie movie = (Movie) obj;

        return releaseYear == movie.releaseYear
                && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }

    public String description() {
        return '"' + title + "\" (" + releaseYear + " год)";
    }
}