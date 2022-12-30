/**
 * Represents the class Taxi.
 * @author Alejandra Guadir 
 */
public class Taxi {
/**
*Represents the tuition Taxi.
*/
    protected String tuition;
/**
*Represents the model Taxi.
*/
    String model;
/**
*Represents the license plate Taxi.
*/
    private String licensePlate;
/**
 *  Returns a plate that represents the instance in string format.
 * @return String in that represents the License Plate.
 * @see #getLicensePlate()
 */

    public String getLicensePlate() {
        return licensePlate;
    }
/**
 * Sets up a new License plate from a string.
 * @param licensePlate
 * String representing the License plate.
 */

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
