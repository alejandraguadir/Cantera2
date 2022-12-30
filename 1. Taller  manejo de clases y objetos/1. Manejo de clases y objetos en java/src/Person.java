import java.sql.Date;

/**
 * Represents the class Person.
 * @author Alejandra Guadir 
 */

public class Person {
    /**
     *Represents the name Person.
     */
    String name;
    /**
     *Represents the lastName1 Person.
     */    
    String lastName1;
    /**
     *Represents the lasrName2 Person.
     */
    String lastName2;
    /**
     *Represents the dateBirth Person.
     */
    Date dateBirth;
    /**
     *Represents the height Person.
     */
    float height;
    /**
     * Returns the name that represents the instance in String format.
     * @return String that represents the name
     * @see #getName()
     */
    
    public String getName() {
        return name;
    }
    /**
     * Establece un nuevo nombre a partir de un String.
     * @param name
     * String que representa el nombre.
     */
    public void setName(String name) {
        this.name = name;
    }

    

}
