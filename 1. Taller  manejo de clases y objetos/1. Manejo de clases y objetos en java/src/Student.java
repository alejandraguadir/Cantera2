import java.sql.Date;

/**
 * Represents the class Student.
 * @author Alejandra Guadir 
 */

public class Student {
/**
*Represents the name Student.
*/
String name;
/**
*Represents the grade Student.
*/
String grade;
/**
*Represents the teacher of Student.
*/
String teacher;
/**
*Represents the date registration grade of Student.
*/
protected Date registrationDate;
/**
*Represents the average of Student.
*/
private Float averageGrade;
/**
 *  Returns the name of the teacher that represents the instance in string format.
 * @return  String that represents the teacher's name.
 * @see #getTeacher()
 */
public String getTeacher() {
    return teacher;
}
/**
 * Sets a new name the teacher from a String
 * @param teacher
 * String representing name teacher.
 * 
 */
public void setTeacher(String teacher) {
    this.teacher = teacher;
}
/**
 * Return the average grade of Student.
 * @return String that represents  average grade of Student.
 * @see #getAverageGrade()
 */
public Float getAverageGrade() {
    return averageGrade;
}
/**
 * Sets a new grade point average from a float
 * @param averageGrade
 * Float que representa el promedio de curso.
 */
public void setAverageGrade(Float averageGrade) {
    this.averageGrade = averageGrade;
}

    
}
