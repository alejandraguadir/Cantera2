/**
 * Represents the class Fruit.
 * @author Alejandra Guadir 
 */
public class Fruit {
    /**
     *Represents the name Fruit.
     */

    String name;
    /**
     *Represents the average weight Fruit.
     */
    private float averageWeight;
    /**
     *Represents list of colors of the fuit.
     */
    String colors[];
    /**
     * Returns the colors of the fruit in string format
     * @return string representing the colors
     * @see #getColors()
     */    
    public String[] getColors() {
        return colors;
    }

    /**
     * Set a new account color from a list of string
     * @param colors
     * String representing colors.
     */
    public void setColors(String[] colors) {
        this.colors = colors;
    }
    
}
