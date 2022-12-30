import java.util.Date;
/**
 * Represents the class Movie.
 * @author Alejandra Guadir 
 */

public class Movie {
    /**
     *Represents list of actors.
     */
    protected String actors[];
    /**
     * represents the name of the director of the movie.
     */
    String director;
    /**
     * Represents release date
     */
    Date releaseDate;
    /**
     * Represents list of genders.
     */
    String genders[];
    /**
     * Represent movie rating.
     */
    private float rating;
    /**
     * Returns the rating of the movie in float format.
     * @return float that represents rating.
     * @see #getRating
     */
    public float getRating() {
        return rating;
    }
    /**
     * Establishes a new rating from a float.
     * @param rating
     * Float that represents the rating.
     */
    public void setRating(float rating) {
        this.rating = rating;
    }

    
}
